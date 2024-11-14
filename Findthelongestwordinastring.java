
package Lab8;
import java.util.Scanner ;

public class Findthelongestwordinastring {
    public static void main (String[] args ) {
        Scanner input = new Scanner (System.in) ;
        System.out.print("Nhap vao chuoi : ");
        String s1 = input.nextLine() ;
        String LongString= "" ;
        String [] word = s1.split("\\s+") ;
        for(String x : word ) {
            if ( x.length() > LongString.length() ) {
                
                LongString = x ;
            }
        }
        System.out.println("tu dai nhat trong chuoi la : " + LongString  );
    }
}
