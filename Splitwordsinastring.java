
package Lab8;
import java.util.Scanner ;

public class Splitwordsinastring {
    public static void main (String[] args ) {
        Scanner input = new Scanner (System.in) ;
        System.out.print("Nhap vao chuoi : ");
        String s1 = input.nextLine() ;
        String [] word = s1.split(" ") ;
        for(String x : word ) {
            System.out.print(x + ",");
        }
    }
}
