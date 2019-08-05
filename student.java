class student
{
String n;
int id,phno;
void display()
{
System.out.println(n);
System.out.println(id);
System.out.println(phno);
}
}
class test
{
public static void main(String[] args)
{
student s1=new student();
s1.n="KAVYA";
s1.id=54;
s1.phno=98;
s1.display();
student s2=new student();
s2.n="SRAVYA";
s2.id=65;
s2.phno=987;
s2.display();
}
}
