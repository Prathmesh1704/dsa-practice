package SubArray;

public class OptimedShortestSubarray {
    
    public static void main(String[] args){
        int [] arr = new int []{2,2,6,4,5,1,5,2,6,4,1};

        int n = arr.length;
        int minele = Integer.MAX_VALUE;
        int maxele = Integer.MIN_VALUE;
        int minlength = Integer.MAX_VALUE;

        for(int i =0;i<n ;i++){
            if(arr[i] < minele){
                minele=arr[i];

            }
            else if(arr[i]>maxele){
                maxele=arr[i];
            }
        }

        if(minele==maxele){
            System.out.println(arr[1]);
        }

        int lastminindex = -1;
        int lastmaxindex=-1;

        for(int i =0;i<n;i++){

            if(arr[i] ==minele){

                lastminindex = i;
            

            if(lastmaxindex != -1){
                int len = i - lastmaxindex+1;

                if(len < minlength){
                    minlength = len;
                }
            }

        }
        if(arr[i]==maxele){
            lastmaxindex = i;

            if(lastminindex != -1){

                int len = i - lastminindex+1;

                if(len < minlength){
                    minlength = len;
                }
            }
        }

        }
        System.out.println(minlength);

    }
}
