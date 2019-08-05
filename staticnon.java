// static or nonstatic accesing by variable or object
class staticnon
{
static int a;
static void display()
{
a=30;
System.out.print(a);
}
public static void main(String[] args)
{
staticnon.display();
}
}