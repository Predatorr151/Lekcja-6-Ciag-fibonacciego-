

public class przypomnienie
{
public static void main()
{
int rozmiar=3;    
int[] tab=new int[rozmiar]; //deklaracja tablicy o wcześniej zadanym rozmiarze


tab[0]=1; //wypełnienie tablicy na miejscu 0 wartością 1
tab[1]=7;
tab[2]=9;

for(int i=0;i<rozmiar;i++)
{
System.out.println(""+tab[i]);


}


}   
}
