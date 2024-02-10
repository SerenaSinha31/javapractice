
import java.util.Scanner;
public class practiceset3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int table = sc.nextInt();
        int i,t=0;
        for( i=1; i<=n; i++){
             t = table*i;
             System.out.println(table + " * " + i + " = " + t);
        }
       
    } 
    
}
