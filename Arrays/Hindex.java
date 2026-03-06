/*274 Given an array of integers citations where citations[i] is the number of citations a researcher received for their ith paper, return the researcher's h-index.

According to the definition of h-index on Wikipedia: The h-index is defined as the maximum value of h such that the given researcher has published at least h papers that have each been cited at least h times. */




/*  approach 1  - 



import java.util.Arrays;
import java.util.Scanner;

public class Hindex {

    public int hIndex(int[] citations) {
        int n = citations.length;

        Arrays.sort(citations);

        for (int i = 0; i < n; i++) {
            if (citations[i] >= n - i) {
                return (n - i);
            }
        }
        return 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of papers: ");
        int n = sc.nextInt();

        int[] citations = new int[n];

        System.out.println("Enter citations:");
        for (int i = 0; i < n; i++) {
            citations[i] = sc.nextInt();
        }

        Hindex obj = new Hindex();
        int result = obj.hIndex(citations);

        System.out.println("H-Index = " + result);

        sc.close();
    }
}



time complexity = 0(nlogn)  .... for sorting function it takes (0(nlogn ) + for loop -  0 (n)) 



*/


/* *
approach 2  - time complexity =  o(n)

*/
import java.util.Scanner;

public class Hindex {

    public int hIndex(int[] citations) {
        int n = citations.length;

        int[] bucket = new int[n + 1];

        for (int i = 0; i < n; i++) {
            int x = citations[i];

            if (x >= n) {
                bucket[n]++;
            } else {
                bucket[x]++;
            }
        }

        int count = 0;

        for (int i = n; i >= 0; i--) {
            count += bucket[i];

            if (count >= i) {
                return i;
            }
        }

        return 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of papers: ");
        int n = sc.nextInt();

        int[] citations = new int[n];

        System.out.println("Enter citations:");
        for (int i = 0; i < n; i++) {
            citations[i] = sc.nextInt();
        }

        Hindex obj = new Hindex();
        int result = obj.hIndex(citations);

        System.out.println("H-Index = " + result);

        sc.close();
    }
}