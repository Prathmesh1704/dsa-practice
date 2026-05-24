package Kadanes;
public class MaximumProductSubarraySum {


    public static void main(String [] args){
        int arr[]  = new int[] {2, 3, -2, 4};
        int n = arr.length;
        int MaxEndinghere = arr[0];
        int MinEndinghere = arr[0];
        int answer = arr[0];

        for(int i=1;i<n;i++){

            if(arr[i]<0){
                int temp = MaxEndinghere;
                MaxEndinghere = MinEndinghere;
                MinEndinghere = temp;


            }

            MaxEndinghere = Math.max(arr[i],MaxEndinghere*arr[i]);

            MinEndinghere = Math.min(arr[i],MinEndinghere*arr[i]);

            answer = Math.max(answer ,MaxEndinghere);



        }
        System.out.println(answer);

    }
    
}
