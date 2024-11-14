
package Lab8;
import java.util.Scanner ;

public class Removeextraspacesinastring {
    public static void main (String[] args ) {
        Scanner input = new Scanner (System.in) ;
        System.out.print("Nhap vao chuoi : ");
        String s1 = input.nextLine() ;
        StringBuilder bd = new StringBuilder () ;
        for(int i =0 ; i < s1.length() ; i++) {
            char c = s1.charAt(i) ;
            if (!Character.isSpaceChar(c)) {
                bd.append(c) ;
            }
        }
        System.out.println("chuoi khi loai bo dau cach la : " + bd);
    }
}
