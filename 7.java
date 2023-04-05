class Bitwise{
public static void main(String[] args){
int a = 10;
int b = 15;
int c = 7;
int d = 20;
String result=a<b&&a<c&&a<d?a+"is smallest":b<c&&b<d?b+"is smallest":c<d?c+"is smallest":d+"is smallest";
System.out.println(result);
}}