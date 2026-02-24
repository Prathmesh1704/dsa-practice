import java.util.Scanner;
class MaxInArray{


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int []arr =  new int[size];

        System.out.print("Enter" + "" +size+""+ "elements");
        for(int i =0;i<size;i++){
            arr[i]=sc.nextInt();

        }

        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i])
                max=arr[i];
            
        }
        System.out.println("Maximun no in array is:"+ max);
        






    }


}