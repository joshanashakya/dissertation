import java.util.Scanner; public class cards {	public static void main(String[] args) {		Scanner s=new Scanner(System.in);		int len=s.nextInt();		String str=s.next();		s.close();		for(int i=0;i<len;i++) {			if(str.charAt(i)=='n')System.out.print("1 ");		}		for(int i=0;i<len;i++) {			if(str.charAt(i)=='z')System.out.print("0 ");		}						}}
