import java.util.Scanner;
public class sumnnumbers {
    public static void main(String[] args){
        int i = 1;
        int sum = 0;
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while(i < n){
           
            sum = sum + i;
            i++;
            
            
        }
        System.out.println("sum = "+sum);
    }
    
}
