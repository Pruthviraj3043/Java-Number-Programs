import java.util.Scanner;
class FactorsUpto
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
for(int i=1;i<20;i++)
{
System.out.println(i);
for(int j=1;j<=i;j++)
{
if(i%j==0)
{
System.out.println(j);
}
}
}
}
}
