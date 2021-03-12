/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows 10
 */
public class CobaQueueStatis {
    public static void main(String[] args){
        Queue Q = new Queue ();
        Q.createEmpty();
        Q.printQueue();
        
        System.out.println("==============================");
        
        Q.add("E31201158", "Albani Khamenei", 90.100);
        Q.add("E31201159", "Mimi Peri", 80.90);
        Q.add("E31201160", "Rahmawati Kekeyi", 70.80);
        
        Q.printQueue();
        System.out.println("==============================");
        Q.del();
        Q.del();
        System.out.println("==============================");
    }
}
