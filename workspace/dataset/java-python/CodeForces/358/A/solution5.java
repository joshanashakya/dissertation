import java.util.*;public class GivenLength{	public static void main(String[] args)	{		Scanner sc=new Scanner(System.in);		int n=sc.nextInt();		int A[]=new int[n];		priorityqueue m=new priorityqueue(n);//		int sum[]=new int[n];		int left=0,right=0;		int answer=0;		if(n>=2){		for(int i=0;i<2;i++)		{			A[i]=sc.nextInt();			m.insert(A[i]);		}}		int i;		for(i=2;i<n;i++)		{			A[i]=sc.nextInt();			int x=m.find(A[i-1]);//			System.out.println(x);			if(x!=m.items-1 && x!=0) 			{				if(A[i]>m.arr[x] && A[i]<m.arr[x+1])				{					m.insert(A[i]);					continue;				}				else if(A[i]<m.arr[x] && A[i]>m.arr[x-1])				{					m.insert(A[i]);					continue;				}				else				{					answer=-1;					break;				}			}			else			{				if(x==m.items-1)				{					if(A[i]>m.arr[0] && A[i]<m.arr[x-1])					{						answer=-1;						break;					}					else					{						m.insert(A[i]);						continue;					}				}				else				{					if(A[i]>m.arr[1] && A[i]<m.arr[m.items-1])					{						answer=-1;						break;					}					else					{						m.insert(A[i]);						continue;					}				}			}		}//		for(int q=i;q<n;q++)//		{//			int w=sc.nextInt();//		}		if(answer==-1)			System.out.println("yes");		else			System.out.println("no");			}}class priorityqueue{	int arr[];	int items=0;	public priorityqueue(int n)	{		arr=new int[n];	}	public int find(int value)	{		int low=0,high=items-1;		while(low<=high)		{			int middle=(low+high)/2;			if(arr[middle]==value)				return middle;			else if(arr[middle]>value)			{				high=middle-1;			}			else 			{				low=middle+1;			}		}		return -1;	}	public void insert(int val)	{		int i;		if(items==0)		{			arr[0]=val;			items++;			return;		}		for(i=items-1;i>=0;i--)		{			if(val<arr[i])			{				arr[i+1]=arr[i];			}			else			{				break;			}		}		arr[i+1]=val;		items++;	}}