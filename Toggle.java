import java.util.*;
public class Toggle
{
 
static void toggleChars(char ar[])
{
    for (int i=0; i<ar.length; i++)
    {
        if (ar[i]>='A' && ar[i]<='Z')
            ar[i] = (char) (ar[i] + 'a' - 'A');
        else if (ar[i]>='a' && ar[i]<='z')
            ar[i] = (char) (ar[i] + 'A' - 'a');
    }
}

public static void main(String[] args)
{
    char ar[] = "ShrADDha RAthoD".toCharArray();
    toggleChars(ar);
    System.out.println("String after toggle ");
    System.out.println(String.valueOf(ar));
}
}