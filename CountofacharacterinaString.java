
package Lab8;
import java.util.Scanner ;

public class CountofacharacterinaString {
    public static void main (String[] args ) {
        Scanner input = new Scanner (System.in) ;
        System.out.print("Nhap vao chuoi : ");
        String s1 = input.nextLine() ;
        int cnt  = 0 ;
        for(int i = 0 ; i < s1.length() ; i++) {
            char c = s1.charAt(i) ;
            if (c == 'o') {
                ++cnt ;
            }
        }
        System.out.println("So lan xuat hien cua  la : " + cnt );
    }
}
