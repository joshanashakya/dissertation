import java.util.*;
import java.lang.*;
public class A1481{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
//System.out.println ("Enter details");
int t = sc.nextInt();
while (t-->0){
int px = sc.nextInt();
int py = sc.nextInt();
String s= sc.next();
int x=0,y=0;
char ch =' ', ch2=' ';
char ch3=' ';
if (px>0) ch='R';
else ch='L';
if (py>0) ch2='U';
else ch2='D';
for (int i =0;i<s.length();i++){
ch3 =s.charAt(i);
if (ch3==ch) x+=1;
if (ch3==ch2) y+=1;
}
if ((Math.abs(px)<=x) && (Math.abs(py)<=y))System.out.println ("YES");
else System.out.println ("NO");
}
}
}
