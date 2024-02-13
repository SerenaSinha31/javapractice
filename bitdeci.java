public class bitdeci {
    public static void bintodecimal(int binNum){
      int pow = 0;
      int decNum =0;

      while(binNum > 0){
        int lastDigit = binNum % 10;
        decNum = decNum + (lastDigit + (int)Math.pow(2, pow));
        binNum=binNum/10;
      }
      System.out.println("the number decimal is = " + decNum);
    }
    public static void main(String[] args){
    bintodecimal(1001000);

    }
    
}
