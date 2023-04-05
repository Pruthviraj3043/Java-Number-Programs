import java.util.Scanner;
class Bitwise{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int d=sc.nextInt();
int e=sc.nextInt();
String result=a<b&&a<c&&a<d&&a<e?a+"is smallest":b<c&&b<d&&b<e?b+"is smallest":c<d&&c<e?c+"is smallest":d<e?d+"is smallest":e+"is smallest";
System.out.println(result);
}}