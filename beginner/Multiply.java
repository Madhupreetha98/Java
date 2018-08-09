import java.io.*;
import java.util.*;
class Multiply{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s1=sc.next();
String s2=sc.next();
int a=Integer.parseInt(s1);
int b=Integer.parseInt(s2);
int c=a*b;
String ans=Integer.toString(c);
System.out.println(ans);
}
}
