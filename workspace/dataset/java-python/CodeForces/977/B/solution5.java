import java.util.Scanner;  public class Main {public static void main(String[] args) {	Scanner sc=new Scanner(System.in);	int n=sc.nextInt();	String s=sc.next();	String[] ss=new String[n-1];	for (int i = 0; i < ss.length; i++) {		ss[i]="";	}	int[] book=new int[n-1];	char []a=s.toCharArray();	for (int i = 0; i < a.length-1; i++) {		for (int j = 0; j <= i; j++) {			if(ss[j]==""){				ss[j]+=a[i];				ss[j]+=a[i+1];				book[j]++;				break;			}			else if(a[i]==ss[j].charAt(0)&&a[i+1]==ss[j].charAt(1)) {				book[j]++;				break;			}					}	}	int max=book[0];	int temp=0;	for (int i = 0; i < book.length; i++) {		if(max<book[i]) {		max=book[i];		temp=i;		}	}	System.out.println(ss[temp]);}}
