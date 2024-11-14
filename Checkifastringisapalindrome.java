
package Lab8;
import java.util.Scanner ;

public class Checkifastringisapalindrome {
    public static void main (String[] args ) {
        Scanner input = new Scanner (System.in) ;
        System.out.print("Nhap vao chuoi : ");
        String s1 = input.nextLine() ; 
        if (Palindrome(s1)) {
            System.out.println("la mot chuoi palindrome");
        }
        else {
            System.out.println("khong phai la mot chuoi palindrome");
        }
    }
    public static boolean Palindrome (String s1 ) {
        int l =0 , r = s1.length() -1 ;
        while (l < r ) {
            if (s1.charAt(l) != s1.charAt(r)) {
                return false ;
            }
            l++ ;
            r-- ;
        }
        return true ;
    }
}
