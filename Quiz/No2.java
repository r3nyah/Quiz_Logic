import java.util.Scanner;
public class No2 {
    public static void main(String args[]) {
    Scanner input = new Scanner (System.in);
    int aa,bb,cc;
    System.out.println("Ganjil/genap?");
    System.out.println("1ganjil,2genap");
    cc=input.nextInt();

    System.out.println("Awal");
    aa=input.nextInt();
    
    System.out.println("Akhir");
    bb=input.nextInt();
    
    switch (cc){
        case 1 :
            System.out.println("Bilangan ganjil");
            for(int i=aa;i<bb;i++){
                if(1%2!=0)
                    System.out.println(i+" ");
                break;
            }
                
        case 2: 
            System.out.println("Bilangan genap");
            for(int i=aa;i<=bb;i++){
                if(i%2==0)
                    System.out.println(i+" ");
            
            break;
            }
            System.out.println(" ");
    }
}
}