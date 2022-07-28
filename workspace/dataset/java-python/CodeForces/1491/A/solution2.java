import java.util.*;
public class kthlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),q=sc.nextInt(),a[]=new int[n],c[]=new int[2];
        for(int i=0;i<n;i++) c[a[i]=sc.nextInt()]++;
        while(q-->0) {
        	int t1=sc.nextInt(),t2=sc.nextInt();
        	if(t1==1){
        	if(a[t2-1]==0){c[1]++;c[0]--;}
        	else {c[1]--;c[0]++;}
        	a[t2-1]=1-a[t2-1];
        	}
        	else {
        		System.out.println(c[1]>=t2 ? 1:0);
        	}
        }
	}

}

