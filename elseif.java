public class elseif{
public static void main(String[] args)
{
int x=10,y=20,z=18;
if(x>=y&&z<=x)
{
System.out.println(x+"is the largest");
}
else if(y>=x&&y>=z)
{
System.out.println(y+"is the largest");
}
else
{
System.out.println(z+"is the largest");
}
}
}