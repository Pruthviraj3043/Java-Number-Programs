import java.util.Scanner;
class Samara
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the character");
char ch=sc.next().charAt(0);
if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z')
{
System.out.println(ch+"is a character");
}
else if(ch>='0'&&ch<='9')
{
System.out.println(ch+"is a Number");
}
else{
System.out.println(ch+"is a Special Character");
}
}
}
