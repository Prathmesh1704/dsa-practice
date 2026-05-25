package DutchNationalFlag;

public class Placing012 {


    

    public static void main(String [] args){

        int [] arr = new int[]{2, 0, 2, 1, 1, 0};
        int n = arr.length;
        int low = 0;
        int mid =0;
        int high = n-1;

        
            while(mid<=high){
                if(arr[mid]==0){
                   int temp = arr[low];
                   arr[low]= arr[mid];
                   arr[mid] = temp;
                   mid++;
                   low++;
                }
                else if(arr[mid]==1){
                    mid++;
                }
                else{
                    int t = arr[high];
                    arr[high]=arr[mid];
                    arr[mid] =t;
                    high--;

                }        
            
            
          
            
            
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }

    }
    
}
