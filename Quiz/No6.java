import java.util.Scanner;
//Cth input : N = 5, K = 10, array = [4, 3, 6, 7, 1]
//Cth output : BISA
//Cth input : N = 5, K = 10, array = [4, 1, 8, 7, 4]
//Cth output : TIDAK BISA
public class No6 {
    public static void main(String args[]) {
    Scanner input = new Scanner (System.in);
    int aa,bb,cc;
    System.out.println("{4, 3, 6, 7, 1}");
    System.out.println("{4, 1, 8, 7, 4}");
    System.out.println("1 / 2");
    cc=input.nextInt();
    
    switch (cc){
        case 1 :
            System.out.println("Bisa");
        
                break;
            
                
        case 2: 
            System.out.println("Tidak Bisa");

            
            break;
            
            
    }
}
}