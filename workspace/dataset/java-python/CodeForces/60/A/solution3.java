import java.util.*;public class xt{	public static void main(String[] args) {		Scanner sc = new Scanner(System.in);		int n = sc.nextInt();		int m = sc.nextInt();		int max = n;		int min =1;		sc.nextLine();		for(int i=0;i<m;i++){			String s = sc.nextLine();			//System.out.println(s);			String[] str = s.split(" ");			if(str[2].equals("left")){				max = Math.min(max,Integer.parseInt(str[4])-1);			}			else{				min = Math.max(min,Integer.parseInt(str[4])+1);			}		}		if(max>=min){			System.out.println(max-min+1);		}		else{			System.out.println(-1);		}			}}
