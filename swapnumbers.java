import java.util.*;
public class swapnumbers
{
public static void  main(String args[])
Scanner swap=new Scanner(System.in);
int a=swap.nextInt();
int b=swap.nextInt();
System.out.println("before swap"+a+ " "+b);
a^=b^=a^=b;
System.out.println("before swap"+a+ " "+b);
swap.close();
}
}

