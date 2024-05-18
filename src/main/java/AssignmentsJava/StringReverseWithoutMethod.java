package AssignmentsJava;
import java.util.*;

public class StringReverseWithoutMethod {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string you want to reverse");
	String s1 = sc.next();
	String reverse="";
	for(int i = s1.length()-1;i>=0;i--) {
		reverse = reverse+ s1.charAt(i);
	}
	System.out.println("The reverse String is "+ reverse);
}
}
