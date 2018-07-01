import java.io.*;
import java.util.*;
class Append{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
StringBuffer s1=new StringBuffer(s);

System.out.println(s1.append("."));
}
}
