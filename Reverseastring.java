
package Lab8;
import java.util.Scanner ;

public class Reverseastring {
    public static void main (String[] args ) {
        Scanner input = new Scanner (System.in) ;
        System.out.print("Nhap vao chuoi : ");
        String s1 = input.nextLine() ;
        StringBuilder bd = new StringBuilder(s1) ;
        System.out.println("Chuoi sau khi dao nguoc la : " + bd.reverse() );
    }
}
