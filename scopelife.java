//scope and lifetime
class scopelife
{
public static void main(String [] args)
{
int a=10;
{
a=20;
System.out.println(a);
}
System.out.print(a);
}
}