
import java.util.Scanner;
public class factorial {
    public static int factorial(int n) {
        int f = 1;
        for(int i = 1; i < n; i++){
            f = f*i;
        }
        return f;

    }


    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int m = sc.nextInt();
      int fact = factorial(m);
      System.out.println("The factorial of a number is = " +fact);
    }
}
