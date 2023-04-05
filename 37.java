class DivisibleCount
{
public static void main(String[] args)
{
int count=0;
int i=1;
for(i=1;i<=100;i++)
{
if(i%2==0 && i%3==0)
{
count++;
}
}
System.out.println(count);
}
}


