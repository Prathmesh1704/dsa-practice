package Queue;

import java.util.PriorityQueue;
import java.util.Scanner;

public class TaskScheduling {
    int priority;
    int time;

    TaskScheduling(int priority,int time){
        this.priority=priority;
        this.time=time;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numer of task : n");
        int n = sc.nextInt();
      
        PriorityQueue<TaskScheduling> pq = new PriorityQueue<>((a,b) -> 
                                Integer.compare(b.priority,a.priority));

       
        
        for(int i=0;i<n ;i++){
           int priority= sc.nextInt();
       


           int time = sc.nextInt();
            pq.add(new TaskScheduling(priority, time));
        }
    

     

        int i=0;
         
        while(!pq.isEmpty()){
                TaskScheduling best = pq.poll();

                System.out.println(best.priority + " ");

                best.time--;
                if(best.time>0)
                    pq.add(best);
    }
   
    }
    
}
