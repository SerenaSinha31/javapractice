

import java.util.Scanner;
public class HW1{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>9 && n<100){
            System.out.println("Number is two digit "+n);
        }
        else{
            System.out.println("not two digit");
        } 
            
      



    }
}