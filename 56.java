import java.util.Scanner;
class palindrome
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int temp=n;
int rev=0;
while(n>0)
{
int r=n%10;
rev=rev*10+r;
n/=10;
}
if(temp==rev)
{
System.out.println("palindrome");
}
else
{
System.out.println("not apalindrome");
}
}
}