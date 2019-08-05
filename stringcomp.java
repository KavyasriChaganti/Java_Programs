import java.util.*;
class stringcomp
{
public static void main(String[] args)
{
Scanner ob=new Scanner(System.in);
String s1=ob.nextLine();
System.out.println("string is" +s1);
String s2=ob.nextLine();
System.out.println("string is" +s2);
//first method
int n=s1.compareTo(s2);
System.out.println("compared string" +n);
//second method
System.out.print(s1.compareTo(s2));
}
}