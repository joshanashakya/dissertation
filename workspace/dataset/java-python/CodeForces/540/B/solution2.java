import java.util.Scanner;import java.util.ArrayList;import java.util.Collections;import java.util.List;public class question {	public static void main(String args[])	{		Scanner scan= new Scanner(System.in);		int n,k,p,x,y,flag = 0;		List <Integer> arrtest = new ArrayList<>();		List <Integer> solution= new ArrayList<>();		n=scan.nextInt();		k=scan.nextInt();		p=scan.nextInt();		x=scan.nextInt();		y=scan.nextInt();		for(int i=0 ;i<k;i++)		{			arrtest.add(scan.nextInt());		}	//	if(sum(arrtest)+(n-k)>x || sum(arrtest)+p*(n-k)<x)	//	{		//	flag=-1;		//	System.out.println("Because of here1");		//}		//System.out.println("WE REACHED HERE");	//	System.out.println("mean is " + mean(arrtest)+ "size is "+ arrtest.size());	//	System.out.print("Sorted array is ");	//	Collections.sort(arrtest);//		for(int se:arrtest) {//			System.out.print(se+" ");//		}//		System.out.println();			int remaining =n-k;	while (remaining>0){				if(x-sum(arrtest)<0)		{		// flag=-1;		// System.out.println("Because of here2");		 break;		}		if (mean(arrtest)>y) {			solution.add(1);			arrtest.add(1);						remaining--;		}				else if (mean(arrtest)<y)		{			int caser = Math.min(y,x-sum(arrtest));			solution.add(caser);			arrtest.add(caser);					remaining --;		}		else		{			Integer caser=Math.min(x-sum(arrtest),y);			if(remaining>=2)			{			solution.add(1);			arrtest.add(1);			solution.add(Math.min(p,caser));						arrtest.add(Math.min(p,caser));			remaining=remaining-2;			}			else			{				if(x-sum(arrtest)<0)				{					flag=-1;				}				else				{									solution.add(caser);					arrtest.add(caser);					}				remaining=remaining-1;			}					if(arrtest.size()>n)			{				flag=-1;				//System.out.println("BECAUSE OF HERE 3");			}		}			}	if(arrtest.contains(0) || mean(arrtest)<y || sum(arrtest)>x)	{	//	System.out.println("HEREEEE "+mean(arrtest)); 		flag=-1;	}	if(flag==-1)	{		System.out.println(flag);//		for(int j:solution)//		{//			System.out.print(j+" ");//		}//		System.out.println();//		for(int j:arrtest)//		{//			System.out.print(j+" ");//		}	}	else if (flag == 0)	{		for(int j:solution)		{			System.out.print(j+" ");		}	}	System.out.println();	 			} 	public static int mean(List<Integer> arrtest)	{		Collections.sort(arrtest);		if(arrtest.size()==0)		{			return 0;		}		else if (arrtest.size()==1)		{			Integer Mean = arrtest.get(0);			return Mean;		}		else		{			int index;			if(arrtest.size()%2==1)			{				index=(arrtest.size()-1)/2	;			}			else			{				index=arrtest.size()/2;			}			Integer Mean = arrtest.get(index);			return Mean;		}						}	public static int sum(List <Integer> arrtest)	{		int Sum=0;				for(Integer x:arrtest)		{			Sum=Sum+x;		}						return Sum;	} }
