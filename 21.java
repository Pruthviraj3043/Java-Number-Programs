import java .util.Scanner;
class Vowel
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter character");
char ch=sc.next().charAt(0);
if(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u')
{
System.out.println(ch+"is a Vowel");
}
else{
System.out.println(ch+"is a consonant");
}
}
}