/* package codechef; // don't place package name! */ import java.util.*;import java.lang.*;import java.io.*; /* Name of the class has to be "Main" only if the class is public. */public class Codechef{	public static void main (String[] args) throws java.lang.Exception	{		// your code goes here		Scanner s = new Scanner(System.in);		int n = s.nextInt();		int k = s.nextInt();		int arr[] = new int[k];		for (int i = 0; i < k; i++){		    arr[i] = s.nextInt();		}		int twos = n * 2;		int fours = n;		for (int i = 0; i < k; i++){		    while (arr[i] >= 4 && fours > 0){		        arr[i] -= 4;		        fours--;		    }		    while (arr[i] >= 4 && fours == 0){		        if (twos >= 2){		            arr[i] -= 4;		            twos -= 2;		        }		    }		}		for (int i = 0; i < k; i++){		    if (arr[i] == 3){    		    if (fours > 0){    		        arr[i] -= 3;    		        fours--;    		    }    		    else if (twos >= 2){    		        arr[i] -= 3;    		        twos -= 2;    		    }		    }		}		int temp = 0;		for (int i = 0; i < k; i++){		    if (arr[i] == 2){		        if (fours > 0){		            arr[i] -= 2;		            fours--;		            temp++;		        }		        else if (twos >= 1){		            arr[i] -= 2;		            twos--;		        }		        else if (temp >= 2){		            arr[i] -= 2;		            temp -= 2;		        }		    }		}		for (int i = 0; i < k; i++){		    if (arr[i] == 1){		        if (fours > 0){		            arr[i] -= 1;		            fours--;		            temp++;		        }		        else if (temp >= 1){		            temp--;		            arr[i]-=1;		        }		        else if (twos >= 1){		            arr[i] -= 1;		            twos--;		        }		    }		}				int sum = 0;		for (int i = 0; i < k; i++){		    sum += arr[i];		}		if (sum == 0){		    System.out.println("YES");		}		else{		    System.out.println("NO");		}	}}
