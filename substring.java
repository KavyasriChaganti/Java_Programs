//string substring
import java.util.*;
class  substring
{
public static void main(String[] args)
{
Scanner ob=new Scanner(System.in);
String s1=ob.nextLine();
System.out.println("enter the string" +s1);
String s2=s1.substring(2,4);
System.out.println("The result string is" +s2);
String s3=s1.substring(2);
System.out.println("the result string is" +s3);
}
}
