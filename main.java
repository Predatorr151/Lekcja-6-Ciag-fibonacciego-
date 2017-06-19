
import java.util.Scanner;
public class main
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Podaj n");
        int n=in.nextInt();
        if(n>=1)
        {

        
            int fib1=0;
            int fib2=1;
            int i=0;
            for(i=0;i<n;i++)
            {
                if(i==0)
                {
                    System.out.println(""+fib1);
                }
                if(i==1)
                {
                    System.out.println(""+fib2);   
                }
                if(i>=2)
                {
                    int fib3=fib1+fib2;
                    System.out.println(""+fib3);
                    fib1=fib2;
                    fib2=fib3;

                }

            }
        }
        else
        System.out.println("Podaj liczbe dodatnią");
    }
}
