
class PrimeNumbers
{
public static void main(String[] args)
{
for(int n=1;n<=100;n++)
{
int fact=0;
for(int i=1;i<=n;i++) 
{
if(n%i==0)
{
fact++;
}
}
if(fact==2)
{
System.out.println( "prime number are"+n);
}
}
}
}