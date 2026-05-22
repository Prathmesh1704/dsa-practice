package SubArray;
public class ShortestSubarrayMinMax{

    public static void main(String[]Strings){
        int arr[] = new int[]{2,2,6,4,5,1,5,2,6,4,1};
        int n = arr.length;
        int maxele = Integer.MIN_VALUE;
        int minele = Integer.MAX_VALUE;
        int minlength = Integer.MAX_VALUE;
        int len=0;

        for(int i=0;i<n;i++){
            

                if(arr[i] < minele){
                    minele=arr[i];
                }
                if(arr[i] > maxele){
                    maxele=arr[i];
                    
                }
            }
        
        if(minele == maxele) {
            System.out.println(1);
            return;
        }
        
        

        for(int i=0;i<n;i++){

            if(arr[i]== minele){
                for(int j=i+1;j<n;j++){
                    if(arr[j]==maxele){
                        len = j - i+1;
   
                    
                    if(len < minlength ){
                        minlength = len;
                      
                    }
                    break;
                }
            }
            }

            else if (arr[i]== maxele){
                for(int j=i+1;j<n;j++){
                    if(arr[j]==minele){
                        len=j-i+1;
                    
                    if(len<minlength){
                        minlength=len;
                      
                    }
                    break;
                }
            }
            }
             
        }System.out.println(minlength);
       
    }



}