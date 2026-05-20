package Queue;

import java.util.PriorityQueue;
import java.util.Scanner;

public class HuffmanCoding{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter frquencies:");
        
        int n = sc.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0;i<n;i++){
            int frequencies = sc.nextInt();

            pq.add(frequencies);
        }


        int finalCost = 0;

        while(pq.size()>1){

            int small = pq.poll(); 
            int secondSmall = pq.poll();
            
            int merge = small+secondSmall;

            finalCost+=merge;

            pq.add(merge);
        }

        System.out.println(finalCost);



    }


}