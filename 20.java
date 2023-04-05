import java.util.Scanner;
class UpperCase
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter alphabet");
char ch=sc.next().charAt(0);
if(ch>='A' && ch<='Z')
{
System.out.println(ch+"is a alphabet");
}
else if(ch>='a' && ch<='z')
{
System.out.println(ch+"is a smallercase");
}
else
{
System.out.println(ch+"is a special character");
}
}
}