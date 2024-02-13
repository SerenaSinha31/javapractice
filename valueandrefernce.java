import java.util.Scanner;

public class valueandrefernce {

    public static void swapnumbers(int a, int b){
        
        int temp;
        temp=a;
        a=b;
        b=temp;

        System.out.println("a value is = "+a);
        System.out.println("b value is = "+b);



    }
    public static int multiply(int a, int b){
        int product = a*b;
        return product;

    }



    public static void main(String[] args){
        int a1 = 10;
        int b1 = 5;
        int pro = multiply(a1,b1);
        System.out.println(pro);

    }
    
}
