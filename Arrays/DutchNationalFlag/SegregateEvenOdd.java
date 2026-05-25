package DutchNationalFlag;

public class SegregateEvenOdd {

    public static void main(String[] args){
        int []arr = new int[]{2,5,4,6,7,8,9};
        int start=0;
        int n = arr.length;
        int end =n-1;
        while(start<=end){
            if(arr[start]%2==0){
                start++;
            }
            else{
                int temp = arr[start];
                arr[start] = arr[ end];
                arr[end] = temp;
                end--;
            }
            
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
    
}
