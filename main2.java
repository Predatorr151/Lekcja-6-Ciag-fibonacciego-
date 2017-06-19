
import java.util.Scanner;
public class main2
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Podaj n");
        int n=in.nextInt(); //wczytuje watrość podaną z klawiatury
        if(n>=1)
        {

            int[] tabFib=new int[n]; //deklaracja tablicy o rozmiarze n
            
            
             
            int i=0;
            for(i=0;i<n;i++)
            {
                if(i==0)
                {
                    //System.out.println(""+tabFib[0]);
                    tabFib[0]=0;
                }
                if(i==1)
                {
                   // System.out.println(""+tabFib[1]);  
                   tabFib[1]=1;
                }
                if(i>=2)
                {
                    tabFib[i]=tabFib[i-1]+tabFib[i-2];
                    //System.out.println(""+fib3);
                }

            }
            
            for(i=0;i<n;i++)
            {
            System.out.println(""+tabFib[i]); //wypisanie liczb z tabFib
            }
        }
        else
            System.out.println("Podaj liczbe dodatnią");
    }
}  

