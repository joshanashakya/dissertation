import java.util.*; public class TCS1 {  				public static void main(String[] args) {	Scanner sc=new Scanner(System.in);		    	String s=sc.nextLine();	String str=sc.nextLine();	String a=str.split(" ")[0];	String b=str.split(" ")[1];	String temp="6789TJQKA";		if(a.charAt(1)==b.charAt(1)) {		if(temp.indexOf(a.charAt(0))>temp.indexOf(b.charAt(0)))System.out.println("YES");		else System.out.println("NO");	}	else {		if(a.charAt(1)==s.charAt(0))System.out.println("YES");		else System.out.println("NO");	}		    	}}
