import java.util.Scanner;
class Strong{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();
int sum=0;
int temp=n;
while(n>0)
{
int rem=n%10;
n=n/10;
int fact=1;
for(int i=1;i<=rem;i++)
{
fact=fact*i;
}
sum=sum+fact;
}
if(temp==sum)
{
System.out.println(temp+"is a strong number");
}
else
{
System.out.println(temp+"is a not strong number");
}
}
}