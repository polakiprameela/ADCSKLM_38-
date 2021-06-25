import java.util.*;
public class evenodd
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int =sc.nextInt();
System.out.println((i^1)==i+1?"even":"odd"; //using XOR operator
System.out.println((i&1)==0?"even":"odd"; //using AND operator
System.out.println((i|1)>i?"even":"odd"; //using OR operator
sc.close();
}
}


