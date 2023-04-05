import java.util.Scanner;
class Prime1
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter the number");
int num=sc.nextInt();
int fact=0;
for(int i=1;i<=num;i++)
{
if(num%i==0)
{
fact++;
}
}
if(fact==1 )
{
System.out.println(num+"is a neither prime nor composite number");
}
else if(fact==2)
{
System.out.println(num+"is a prime number");
}
else if(fact>2)
{
System.out.println(num+"is a composite number");
}
}
}