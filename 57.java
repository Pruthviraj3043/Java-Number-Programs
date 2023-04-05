
class palindromeNumbers
{
public static void main(String[] args)
{

for(int i=100;i<=300;i++)
{
int n=i;
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
System.out.println(temp+"is a palindrom");
}
}
}
}