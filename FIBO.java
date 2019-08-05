public class FIBO {
  public static void main(String[]args){
      int a=-1,b=1,c,n=19;
      while(n>0){
                c=a+b;
                a=b;
                b=c;
                n--;
                System.out.println(c);
          }

  }    
}
