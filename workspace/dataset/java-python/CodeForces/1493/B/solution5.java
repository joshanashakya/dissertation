 import java.util.*;import java.io.*;import java.text.DecimalFormat;  public class pplanet {  static DecimalFormat df1 = new DecimalFormat("#.000000");static DecimalFormat df = new DecimalFormat("#.######");static boolean printing=false; static int N; static int total=0;  public static void main(String[] args) throws Exception {      	  	     BufferedReader in = new BufferedReader(new InputStreamReader(System.in));        	  // Scanner in = new Scanner(System.in);	   	   if(printing){	       //in = new Scanner(new File("p3.in"));		   in = new BufferedReader(new FileReader("pplanet.in"));	   }	   StringTokenizer tokenizer = new StringTokenizer(in.readLine());				boolean[] lookup=new boolean[10];		lookup[0]=true;		lookup[1]=true;		lookup[2]=true;		lookup[3]=false;		lookup[4]=false;		lookup[5]=true;		lookup[6]=false;		lookup[7]=false;		lookup[8]=true;		lookup[9]=false;				N = Integer.parseInt(tokenizer.nextToken());		for(int q=0;q<N;q++){						tokenizer = new StringTokenizer(in.readLine());			int h= Integer.parseInt(tokenizer.nextToken());			int m= Integer.parseInt(tokenizer.nextToken());			tokenizer = new StringTokenizer(in.readLine(),": ");			int hour= Integer.parseInt(tokenizer.nextToken());			int minute= Integer.parseInt(tokenizer.nextToken());			//if(printing){			//	System.out.println(h+","+m);			//	System.out.println(hour+","+minute);			//}						int minutes=minute;			int count=0;			boolean found=false;			boolean swap=false;			while(count<m && !found){								int temp=minutes;				while(true){					//System.out.println(minutes);					if(!lookup[temp%10]){						break;					}					if(temp>=10)						temp=temp/10;					else					{						String t3=(new StringBuilder().append(""+minutes).reverse()).toString();						String t4=t3.replace('2', 'a');						String t5=t4.replace('5','2');						String t6=t5.replace('a', '5');						int t2=Integer.parseInt(t6);						//System.out.println("t2="+t2);						//System.out.println(t2);						if(minutes<10)							t2=t2*10;						if(t2<h){							found=true;													}						break;					}				}				if(!found){					minutes=(minutes+1)%m;					count++;				}			}						if(minutes<minute)				hour=(hour+1)%h;									int hours=hour;			count=0;			found=false;			while(count<h && !found){				int temp=hours;				//System.out.println(hours+"__"+m);				while(true){										if(!lookup[temp%10]){						break;					}					if(temp>=10)						temp=temp/10;					else					{												String t3=(new StringBuilder().append(""+hours).reverse()).toString();						String t4=t3.replace('2', 'a');						String t5=t4.replace('5','2');						String t6=t5.replace('a', '5');						int t2=Integer.parseInt(t6);																		if(hours<10)							t2=t2*10;						//System.out.println(hours+"***"+t2);						if(t2<m){							found=true;													}						break;					}									}				//System.out.println("-----------");				if(!found){					if(hours+1>=h)						swap=true;					hours=(hours+1)%h;					count++;				}			}			if(hours>hour || swap)				minutes=0;			String pHours=""+hours;			String pMinutes=""+minutes;						if(pHours.length()<2)				pHours="0"+pHours;						if(pMinutes.length()<2)				pMinutes="0"+pMinutes;						System.out.println(pHours+":"+pMinutes);					}						//System.out.println(total);		in.close();			}  }
