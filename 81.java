import java.util.Scanner;
class AandN
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int n=sc.nextInt();
int product=1;
for(int i=1;i<=n;i++)
{
product*=a;
}
System.out.println(a+" power "+n+" value is:"+product);
}
}