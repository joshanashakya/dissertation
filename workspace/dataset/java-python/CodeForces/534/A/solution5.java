import java.util.Scanner;import java.lang.Math; public class Main {	public static void main(String[] args){		Scanner sc = new Scanner(System.in);		int n = sc.nextInt();		int[] par = new int[n];		int[] impar = new int[n];		int i;		int h =0;		int j = 0;		for(i=1;i<=n;i++){			if(i%2==0){				par[h] = i;				h++;			}else{				impar[j] = i;				j++;			}		}		if(n==1){			System.out.println(n);			System.out.println(n);		}else if(n==2){			System.out.println(n-1);			System.out.println(n);		}else if(n==3){			System.out.println(n-1);			for(i=0;i<n-1;i++){				System.out.print(impar[i]+ " ");			}		}else if(n==4){			System.out.println(n);			System.out.println(3+" "+1+" "+4+" "+2);		}else{			System.out.println(n);			i=0;			while(impar[i]!=0){				System.out.print(impar[i]+" ");				i++;			}			i=0;			while(par[i]!=0){				System.out.print(par[i]+" ");				i++;			}		}	}}  	 		  	   					  				   	  			