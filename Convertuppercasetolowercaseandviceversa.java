
package Lab8;
import java.util.Scanner ;

public class Convertuppercasetolowercaseandviceversa {
    public static void main (String[] args ) {
        Scanner input = new Scanner (System.in) ;
        System.out.print("Nhap vao chuoi : ");
        String s1 = input.nextLine() ; 
        StringBuilder bd = new StringBuilder () ;
        for(int i =0 ; i < s1.length() ; i++) {
            char c = s1.charAt(i) ;
            if (Character.isUpperCase(c)) {
                bd.append(Character.toLowerCase(c) ) ;
            }
            else {
                bd.append(Character.toUpperCase(c) )  ;
            }
        }
        System.out.println("Chuoi sau khi convert la : " + bd.toString() );
    }
}
