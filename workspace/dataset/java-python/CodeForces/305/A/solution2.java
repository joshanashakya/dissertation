// dee 4a8al isa ;D import java.util.Scanner;public class Game{	public static void main(String[] args)	{		Scanner input = new Scanner(System.in);				int n = input.nextInt(); 		int[] arr = new int[n];		int[] prt = new int[n];				boolean test1[] = new boolean[2],test2 = false, test3 = false, test4 = false;				test1[0] = false;		test1[1] = false;				int j = 0, stepn = 0;		for(int i = 0; i < n; i++)		{			int num = input.nextInt();			arr[i] = num;			if(num == 0 && !test1[0])			{				test1[0] = true;				prt[j++] = num;//				System.out.println(1);			}			else				if(num == 100 && !test1[1])				{					test1[1] = true;					prt[j++] = num;//					System.out.println(2);				}				else					if(num > 0 && num < 10 && !test2)					{						test2 = true;						prt[j++] = num;//						System.out.println(3);					}					else						if(num % 10 == 0 && !test3)						{							test3 = true;							prt[j++] = num;//							System.out.println(4);						}						else							if(!((num == 0) || (num == 100) || (num > 0 && num < 10) || (num % 10 == 0)) && !test4)							{								test4 = true;											stepn = num;//							System.out.println(num);							}		}		if((j == 0 || j==1)  && !((test1[0] || test1[1]) && !test2 && !test3 && (j ==2 || j==1 ) && stepn != 0))		{			System.out.println(1);			System.out.println(arr[0]);		}		else			if((test1[0] || test1[1]) && !test2 && !test3 && (j ==2 || j==1 ) && stepn != 0)			{				System.out.println(j+1);				for(int i = 0; i < j; i++)					System.out.print(prt[i] + " " );				System.out.println(stepn);			}			else			{				System.out.println(j);				for(int i = 0; i < j; i++)				{					System.out.print(prt[i] + " ");				}				System.out.println();			}	}}