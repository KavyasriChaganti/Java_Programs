
import java.util.*;
class stringequalignore
{
public static void main(String[] args)
{
Scanner ob=new Scanner(System.in);
String s1=ob.nextLine();
System.out.println("string is" +s1);
String s2=ob.nextLine();
System.out.println("string is" +s2);
System.out.print(s1.equalsIgnoreCase(s2));
}
}