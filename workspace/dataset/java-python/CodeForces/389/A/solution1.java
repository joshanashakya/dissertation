import java.util.Scanner;import java.lang.*;public class Solution{	public static void main(String args[]){		Scanner sc = new Scanner(System.in);        int n = sc.nextInt();        int largest;        int smallest;        int help;                int z1=0;        int arr1[] = new int[n];        for(int i1=0;i1<n;i1++){            arr1[i1]=sc.nextInt();        }        for(int i2=0;i2<n;i2++){            for(int i3=i2;i3<n;i3++){                int o1 = (arr1[i2]>arr1[i3])?(arr1[i2]):(arr1[i3]);                arr1[i3] = (arr1[i2]<arr1[i3])?(arr1[i2]):(arr1[i3]);                arr1[i2] = o1;            }        }        largest=arr1[0];        smallest=arr1[n-1];		//help=(int)Math.sqrt(largest);        help=smallest;		help++; 		int arr2[] = new int[help];        for(int i4=1;i4<=help;i4++){            if(largest%i4==0){                for(int i5=0;i5<n;i5++){                    if(arr1[i5]%i4==0){                        z1++;                    }                }                if(z1==n){                    arr2[i4-1]=i4;                }                z1=0;            }        }        for(int i6=help-1;i6>=0;i6--){            if(arr2[i6]!=0){                System.out.println(arr2[i6]*n);                break;            }        }	}}