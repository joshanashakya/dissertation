    import java.io.*;         import java.util.*;                   public class Main {                   	public static void main(String[] args) {         		Scanner sc = new Scanner(System.in);         		    		long x=sc.nextLong();    		long y=sc.nextLong();    		long f=sc.nextLong();    		long l=sc.nextLong();    		long max=0;    		int j=0;    		int p=0;    		    		ArrayList<Long> res=new ArrayList<>();    		for(j=0;j<60;j++){    		        for(p=0;p<60;p++){    		            if((Math.pow(x,j)+Math.pow(y,p))<=1000000000000000000l){    		            if((pow(x,j)+pow(y,p))>=f&&(pow(x,j)+pow(y,p))<=l){    		                res.add((pow(x,j)+pow(y,p)));    		            }    		            }    		        }    		}    		int i=0;    		    		Collections.sort(res);    		long[] arr=new long[res.size()+1];    		    		if(res.size()>0){    		  arr[0]=res.get(0)-f;    		for(i=1;i<arr.length-1;i++){         //890689132792406667    		    arr[i]=res.get(i)-res.get(i-1)-1;//220116531311479700    		                                     //84826654960259    		}                                    //375314289098080160    		arr[arr.length-1]=l-res.get(i-1);    		for(i=0;i<arr.length;i++){    		    if(arr[i]>max){    		        max=arr[i];    		    }    		}    		}    		else{    		    max=l-f+1;    		}    		     		System.out.println(max);    	}    	public static long pow(long x,long y){    	    long res=1;    	    while(y>0){    	        res=res*x;    	        y--;    	    }    	    return(res);    	}    	    	    	    	    	    }
