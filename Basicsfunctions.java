
//basic function
import java.util.*;
public class Basicsfunctions {
//     public static void printHelloWorld(){
//     System.out.println("Hello World");
//     System.out.println("Hello World");
//     System.out.println("Hello World");
//     return ;
// }
   public static int calculatesum(int a1, int b1){
   
    int sum = a1 + b1;
    return sum;
    

}

    
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum = calculatesum(a, b);
    System.out.println("Sum is = " + sum);
}
}
