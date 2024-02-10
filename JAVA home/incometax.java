
import java.util.*;
public class incometax {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,tax;
        n = sc.nextInt();


        if (n < 500000) {
            tax = 0;
            System.out.println("Tax is = " + tax);
        } else if (n >= 500000 && n <= 1000000) {
            tax = (int) (n * 0.20); // 20% tax for the income range
            System.out.println("Tax is = " + tax);
        } else {
            tax = (int) (n * 0.30); // 30% tax for income above 1000000
            System.out.println("Tax is = " + tax);
        }
    }
    
    
}
