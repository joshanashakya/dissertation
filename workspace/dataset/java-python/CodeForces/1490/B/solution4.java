import java.util.*;

public class S
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		
		while(t--!=0){
			int n=scan.nextInt();
			int[]arr=new int[3];
			for(int i=0;i<n;i++){
				int num=scan.nextInt();
				arr[num%3]++;
			}
			int maxi=-1,max=-1;
			for(int i=0;i<3;i++){
				if(arr[i]>max){maxi=i;max=arr[i];}
			}
			int ans=(arr[maxi]-(n/3));
			arr[(maxi+1)%3]+=ans;
			if(arr[(maxi+1)%3]>arr[(maxi+2)%3])ans+=((n/3)-arr[(maxi+2)%3]);
			else ans+=2*((arr[(maxi+2)%3])-(n/3));
			System.out.println(ans);
		}
	}
}

