public class perfect{
   public static void main(String[] args){
        int i,m=0,a=2,b=1000,j=0,c=0;
        for(j=a;j<b;j++)
          {m=0;
             for(i=1;i<=j/2;i++)
                    {
                  if(j%i==0)
                        m=m+i;
                      }
             if(m==j)
                     System.out.print("   "+j);
         
          }     
 }
}
