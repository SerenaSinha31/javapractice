

//Inverted star
public class pattern2 {
    public static void main(String[] args){
        for(int i = 1 ; i <= 4; i++){
            for(int j = 4; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
// other method
// for(int i = 1 ; i <= 4; i++){
//     for(int j = 1; j<=(n-i+1); j--)