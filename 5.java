import java.util.Scanner;
class ternary{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the values");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
String result=a>b && a>c?a+"is greatest":b>c?b+"is greatest":c+"is greatest";
System.out.println(result);
}
}
