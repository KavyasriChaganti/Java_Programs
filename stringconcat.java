import java.util.*;
class stringconcat
{
public static void main(String[] args)
{
Scanner ob=new Scanner(System.in);
String s1=ob.nextLine();
System.out.println("the string is" +s1);
String s2=ob.nextLine();
System.out.println("the string is" +s2);
String s3,s4;
//first method
s3=s1+s2;
System.out.println("concatenated string" +s3); 
//second method 
s4=s1.concat(s2);
System.out.print("concated String" +s4);
}
}