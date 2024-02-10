

import java.util.*;
public class bill {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float pencil,pen,eraser;
        pencil=sc.nextFloat();
        pen=sc.nextFloat();
        eraser=sc.nextFloat();

        float total = (pencil + pen + eraser);
      System.out.println(total);
      float totalbill = total + ((0.18f
      )*total);
      System.out.println(totalbill);


    }
    
}
