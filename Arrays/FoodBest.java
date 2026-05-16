import java.util.PriorityQueue;
import java.util.Scanner;

public class FoodBest {

    long currentTaste ;
    long decrease;

    FoodBest(long currentTaste , long decrease){
        this.currentTaste= currentTaste;
        this.decrease=decrease;
    }

    public  static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m =sc.nextInt();
        long v[] = new long[n];
        long d[]=new long[n];

        for(int i=0;i<n;i++){
            v[i] = sc.nextLong();
        }
        for(int i=0;i<n;i++){
            d[i] = sc.nextLong();
        }


        PriorityQueue<FoodBest> pq = new PriorityQueue<>((a,b)-> Long.compare(b.currentTaste,a.currentTaste));

        for(int i=0;i<n;i++){
            pq.add( new FoodBest(v[i],d[i]));
            
        }

        long answer=0;

        for(int i=0; i<m;i++){
            FoodBest best = pq.poll();


            if(best.currentTaste<=0){
                break;
            }

            answer+=best.currentTaste;

            best.currentTaste-=best.decrease;

            pq.add(best);

        }
        System.out.println(answer);
    }
    
}
