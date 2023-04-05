import java.util.Scanner;
class PositionAlphabet
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
char c=sc.next().charAt(0);
int a=1;
for(char ch='A';ch<='Z';ch++)
{
if(ch==c)
{
System.out.println(c+"is present in "+a+" th position");
break;
}
a++;
}
}
}