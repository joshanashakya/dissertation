import java.util.*;public class JohnnyAndHobbies { 	public static void main(String[] args) {		// TODO Auto-generated method stub		Scanner sc=new Scanner(System.in);		int t=sc.nextInt();		while(t-->0) {			int n=sc.nextInt();			int[]arr=new int[n];			int max=-1;			HashSet<Integer>set=new HashSet<>();			for(int i=0;i<n;i++) {				arr[i]=sc.nextInt();				set.add(arr[i]);				max=Math.max(max, arr[i]);			}						boolean flag=false;			for(int i=1;i<=1024;i++) {				HashSet<Integer>s=new HashSet<>(set);				for(int j=0;j<n;j++) {					int xor=i^arr[j];										if(s.contains(xor)) {						s.remove(xor);					}				}				if(s.isEmpty()) {					System.out.println(i);					flag=true;					break;				}			}			if(!flag) {				System.out.println(-1);			}		}			} }
