import java.util.Scanner;

public class MaxSoFar{

    static int Kadanes(int []arr){
        int maxsofar=arr[0];
        int curr=arr[0];

        for(int i=1;i<arr.length;i++){
            curr = Math.max(arr[i],arr[i]+curr);
            maxsofar = Math.max(maxsofar,arr[i]);
        }

        return maxsofar;
    }

    public  static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[m];

        for(int i =0 ; i<m;i++){
            arr[i] = sc.nextInt();
        }

        int answer = Kadanes(arr);

        for(int swap =0 ;swap<k ; swap++ ){

            int best = answer;
        
            
            for(int i =0 ; i<m ;i++){
                for(int j=i+1;j<m ; j++){

                     int temp= arr[i];
                     arr[i] = arr[j];
                     arr[j] = temp;


                     best = Math.max(best,Kadanes(arr));

                     temp= arr[i];
                     arr[i] = arr[j];
                     arr[j] = temp;




                }
            }
            answer = best;
        }

        System.out.println(answer);
    }

}