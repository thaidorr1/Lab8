
package Lab8;
import java.util.Scanner ;

public class Countthenumberofwordsinastring {
    public static void main (String[] args ) {
        Scanner input = new Scanner (System.in) ;
        System.out.print("Nhap vao chuoi : ");
        String s1 = input.nextLine() ;
        String [] word = s1.split("\\s+") ;
        int cnt = 0 ;
        for(String x : word ) {
            ++cnt ;
        }
        
        System.out.println("So tu trong chuoi la : " + cnt  );
    }
}
