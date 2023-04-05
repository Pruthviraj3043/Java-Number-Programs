class Bitwise{
public static void main(String[] args){
int a = 15;
int b = 25;
int c = 65;
int d = 90;
int e = 40;
String result=a>b&&a>c&&a>d&&a>e?a+"is greatest":b>c&&b>d&&b>e?b+"is greatest":c>d&&c>e?c+"is greatest":d>e?d+"is greatest":e+"is greatest";
System.out.println(result);
}}