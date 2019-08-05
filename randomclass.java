//random class
import java.util.*;
class randomclass
{
public static void main(String[] args)
{
Random ob=new Random();
System.out.println("enter a number");
int a=ob.nextInt();
System.out.println(a);
System.out.println("enter float number");
float b=ob.nextFloat();
System.out.println(b);
System.out.println("enter double number");
double c=ob.nextDouble();
System.out.println(c);
//math random
System.out.println(Math.random());
//getting the values of two random classes are equal
Random ob1=new Random(400);
Random ob2=new Random(400);
int d=ob1.nextInt();
int e=ob2.nextInt();
System.out.println(d);
System.out.println(e);
}
}

