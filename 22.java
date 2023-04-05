import java.util.Scanner;
class Char
{
public static void main(String[] main)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Character");
char ch=sc.next().charAt(0);
if(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u')
{
System.out.println(ch+"is a Vowel");
}
else if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z')
{
System.out.println(ch+"is a Consonant");
}
else{
System.out.println(ch+"is a special symbol");
}
}
}
