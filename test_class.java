//without parameter without return type
class test
{
test()
{
System.out.println("constructor");
}
void display()
{
System.out.println("hello");
}
void print()
{
System.out.println("hai");
}
}
class test_pro
{
public static void main(String[] args)
{
test ob=new test();
ob.print();
test ob1=new test();
ob.display();
}
}
