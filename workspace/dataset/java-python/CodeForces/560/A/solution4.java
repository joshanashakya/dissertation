import java.util.*;public class CurrencySysteminGeraldion { 	public static void main(String[] args) {		// TODO Auto-generated method stub		Scanner sc= new Scanner(System.in);		int n=sc.nextInt();		int z=0;		for(int i=0;i<n;i++)		{			int temp=sc.nextInt();			if(temp==1)				z=-1;		}		if(z==-1)			System.out.println(-1);		else			System.out.println(1);	} }