import java.util.Scanner;
class AlphabetNumber
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int p=sc.nextInt();
int a=1;
for(char ch='A';ch<='Z';ch++)
{
if(p==a)
{
System.out.println(ch+"is present in "+p+" th position");
break;
}
a++;
}
}
}