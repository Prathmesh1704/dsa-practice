package Practice;
  
public class Test {

    public static void main(String[] args) {
        System.out.println("Original main");
        main(10);
    }

    public static void main(int a) {
        System.out.println("Overloaded main");
    }
}
    

