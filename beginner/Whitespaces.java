import java.io.*;
import java.util.*;
class Whitespaces{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
char[] c=s.toCharArray();
StringBuffer sb=new StringBuffer();
for(int i=0;i<c.length;i++)
{
if((c[i]!=' ') && (c[i]!='\t'))
{
sb.append(c[i]);
}
}
System.out.println(sb);
}
}
