import java.util.*; public class question {			public static void main(String[] args) {				Scanner sc = new Scanner(System.in);			int a[] = {5,7,5},  flag=0;		for(int l=0; l<3; l++) {			String s = sc.nextLine();			String x = s;			int count=0;			for(int i=0; i<x.length(); i++) {				char ch = s.charAt(i);				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')					count++;					}			if( count != a[l] ) {				System.out.println("NO"); flag++;  break; }		}		if( flag==0 )			System.out.println("YES");			}}				  
