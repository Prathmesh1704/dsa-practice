public class PrefixSum{

    public static void main(String [] args){

        int [] arr = new int[]{-3,6,2,4,5,2,8,-9,3,1};

        int n = arr.length;

        int prefix[] = new int[n];
        prefix[0] = arr[0];

        for(int i=1;i<n;i++){
            prefix[i] = prefix[i-1] +arr[i];
        }

        int sum=0;
        int l =  1;
        int r = 3;

        if(l==0){
            sum =prefix[r];
        }
        else{
            sum = prefix[r] - prefix[l-1]; 
        }

        System.out.println(sum);
    }
}