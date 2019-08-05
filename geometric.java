//geometric functions
class geometric
{
int l,b;
float r;
double x,h; 
void area (float a)
{
r=a;
System.out.println("area of circle is:");
System.out.println((Math.PI)*r*r);
}
void area (int x,int y)
{
l=x;
b=y;
System.out.println("area of rectangle:");
System.out.println(l*b);
}
void area (double s,double k)
{
s=x;
k=h;
System.out.println("area of triangle");
System.out.println(x*h);
}
}
class test
{
public static void main(String[] args)
{
geometric ob=new geometric(System.in);
ob.area(10.2f);
ob.area(10,5);
ob.area(2.5,3.5);
}
}

