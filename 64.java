import java.util.Scanner;
class SumAlphabet
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sum=0;
while(n>0)
{
int r=n%10;
sum+=r;

n/=10;
}
if(sum>=26)
{
int a=sum;
sum=0;
while(a>0)
{
int r=a%10;
sum+=r;
a/=10;
}
}
int b=1;
for(char ch='A';ch<='Z';ch++)
{
if(sum==b)
{
System.out.println("Alphabet present in the"+sum+"th position is "+ch);
break;
}
b++;
}
}
}
