

public class CarryForward {


    /*Brute force Approach */
    /*public static void main(String[] args){
        int arr[] =  new int[]{-3,6,2,4,5,2,8,-9,3,1};
        int n =10;
        int leftMax [] = new int[n];

        for(int i=0;i<n;i++){
            int maxelement= Integer.MIN_VALUE;
            for(int j=0;j<=i;j++){
                if(maxelement<arr[j]){
                    maxelement=arr[j];
                }
                leftMax[i] = maxelement;
            }

        }
        for(int i=0;i<n;i++){
            System.out.println(leftMax[i] +" ");
        }
    }*/

    public static void main(String[] args){
        int arr[] =  new int[]{-3,6,2,4,5,2,8,-9,3,1};
        int n =10;
        int leftMax [] = new int[n];

        leftMax[0]=arr[0];
        for(int i=1;i<n;i++){
            if(leftMax[i-1] <arr[i])
                leftMax[i] = arr[i];
            else
                leftMax[i] = leftMax[i-1];

        }

        for(int i=0;i<n;i++){
            System.out.println(leftMax[i] + " ");
        }



    }


    
}
