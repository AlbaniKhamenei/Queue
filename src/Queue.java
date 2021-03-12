/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows 10
 */
public class Queue {
    private int first;
    private int last;
    private NilaiMataKuliahQueue[] data = new NilaiMataKuliahQueue [10];
    
    Queue(){
        for(int i=0; i<9; i++){
            data [i]= new NilaiMataKuliahQueue();
        }
    }
        void setFirst(int first){
        this.first = first;
    }
    int getFirst (){
        return first;
    }
    void createEmpty(){
        first = -1;
        last = -1;
    }
     boolean isEmpty (){
         boolean hasil = false;
         if(first == -1){
             hasil = true;
         }
         return hasil;
     }
     boolean isFull () {
         boolean hasil = false;
         if(last == 9){
             hasil = true;
         }
         return hasil;
     }
        void add(String nim, String nama, double nilai){
         if (isEmpty() == true){  //jika queue penuh 
        last = 0;
        first = 0;
        data[0].setNim (nim);
        data[0].setNama (nama);
        data[0].setNilai (nilai);
         }
         else{ //jika queue kosong
         if (isFull()!= true) {
           last = last +1;
           data[last].setNim (nim);
           data[last].setNama (nama);
           data[last].setNilai (nilai);
         }
         else {
             System.out.println("antrian penuuh");
         }
         }
        }
        void del(){
            if(last == 0){
                first = -1;
                last = -1;
            }
            else{ //menggeser elemen antrian kedepan
             int i;
             for (i=(first+1); i<=last; i++){
               data[i-1].setNim (data[i].getNim());
               data[i-1].setNama (data[i].getNama());
               data[i-1].setNilai (data[i].getNilai());
            }
             last = last -1;
        }
        }
        void printQueue(){
            if(first!= -1){
                System.out.println("---------------isi queue---------------");
                int i;
                for(i= last; i>=first; i--){
              System.out.println("==============================");
              System.out.println("elemen ke- " +1);
              System.out.println("nim : " + data[i].getNim());
              System.out.println("nama : " + data[i].getNama());
              System.out.println("nilai : " + data[i].getNilai());
             }
             System.out.println("------------------------------");
         }
         else {
             //proses queuenya kosong
             System.out.println("queue kosong");
                }
            }
        }
