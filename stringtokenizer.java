// String tokens
import java.util.*;
class stringtokenizer
{
public static void main(String[] args)
{
StringTokenizer ob=new StringTokenizer("KAVYA CHAGANTI");
String s=ob.nextToken();
System.out.println(s);
int a=ob.countTokens();
System.out.println(a);
boolean c=ob.hasMoreTokens();
System.out.println(c);
}
}