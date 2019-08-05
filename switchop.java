public class switchop
{
public static void main(String[] args)
{
int a=20,b=25,c;
char operator='+';
switch (operator)
{
case '+':
c=a+b;
System.out.println(c);
break;
case '-':
c=a-b;
System.out.println(c);
break;
case '*':
c=a*b;
System.out.println(c);
break;
case '/':
c=a/b;
System.out.println(c);
break;
default:
System.out.println("there is no number");
}
}
}
 