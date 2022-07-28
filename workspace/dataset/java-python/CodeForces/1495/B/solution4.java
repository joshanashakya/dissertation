 	import java.util.*;	import java.io.*;	import java.text.DecimalFormat;  	public class hiking {  	static DecimalFormat df1 = new DecimalFormat("#.000000");	static DecimalFormat df = new DecimalFormat("#.######");	static boolean printing=false; 	static int N; 	static long total=0L;	static int ret=0; 	public static void main(String[] args) throws Exception {		  					 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));					  // Scanner in = new Scanner(System.in);		   		   if(printing){			   //in = new Scanner(new File("p3.in"));			   in = new BufferedReader(new FileReader("hiking.in"));		   }		   StringTokenizer tokenizer = new StringTokenizer(in.readLine());						int n = Integer.parseInt(tokenizer.nextToken()); 			tokenizer = new StringTokenizer(in.readLine());							int[] A=new int[n];							for(int i=0;i<n;i++){				A[i]=Integer.parseInt(tokenizer.nextToken());			}			if(printing)				System.out.println(Arrays.toString(A));								   	boolean done=false;						if(n<=4)				done=true;						char[] D=new char[n];			if(A[1]<A[0])				D[0]='T';			else				D[0]='B';			for(int i=1;i<n && !done ;i++){				if(i==n-1){					if(A[i]>A[i-1])						D[i]='T';					else						D[i]='B';				}				else if(A[i]>A[i-1] && A[i]>A[i+1]){					D[i]='T';				}				else if(A[i]<A[i-1] && A[i]<A[i+1]){					D[i]='B';				}else if(A[i]<A[i+1]){					D[i]='L';				}else 					D[i]='R';				}						int lcount=0;			int rcount=0;			int lMax=0;			int rMax=0;									for(int i=1;i<n && !done;i++){				if(D[i]=='T' || D[i]=='B'){					lcount=0;					rcount=0;					continue;				}				if(D[i]=='L'){						lcount++;						lMax=Math.max(lMax, lcount);				}				else{						rcount++;						rMax=Math.max(rMax, rcount);				}			}						if(lMax+rMax<=1)				done=true;						if(lMax!=rMax)				done=true;						lcount=0;						int lOccur=0;			int rOccur=0;						for(int i=1;i<n && !done;i++){				if(D[i]=='T' || D[i]=='B'){					lcount=0;					rcount=0;					continue;				}				if(D[i]=='L'){						lcount++;						if(lMax==lcount)							lOccur++;				}				else{						rcount++;						if(rMax==rcount)							rOccur++;				}			}			if(lOccur>1 || rOccur>1)				done=true;									lcount=0;			rcount=0; 			if(printing)				System.out.println(Arrays.toString(D));			 						if(lMax>rMax && !done){				if(printing)						System.out.println("1 lMax="+lMax+",rMax="+rMax);										  for(int i=1;i<n && !done;i++){						if(D[i]=='T' || D[i]=='B'){							lcount=0;							rcount=0;							continue;						}						if(D[i]=='L'){							lcount++;							if(lcount==lMax){								if(i+1<n && D[i+1]=='T'){									int k=i+1;									rcount=0;									while(k+1<n && D[k+1]=='R'){										rcount++;										k++;									}									if(rcount%2==1)										ret++;								}							}						}				  }			} else if(lMax<rMax && !done){			 	 if(printing)						System.out.println("2 lMax="+lMax+",rMax="+rMax);				  for(int i=n-1;i>=0 && !done;i--){						if(D[i]=='T' || D[i]=='B'){							lcount=0;							rcount=0;							continue;						}						if(D[i]=='R'){							rcount++;							if(rcount==rMax){								if(i-1>=0 && D[i-1]=='T'){									int k=i-1;									lcount=0;									while(k-1>=0 && D[k-1]=='L'){										lcount++;										k++;									}									if(lcount%2==1)										ret++;								}							}						}				  }									} else if(!done) {				/////					if(printing)						System.out.println("3 lMax="+lMax+",rMax="+rMax);											for(int i=1;i<n && !done;i++){												if(D[i]=='T' || D[i]=='B'){							lcount=0;							rcount=0;							continue;						}						if(D[i]=='L'){							lcount++;							if(lcount==lMax){								if(i+1<n && D[i+1]=='T'){									int k=i+1;									rcount=0;									while(k+1<n && D[k+1]=='R'){										rcount++;										k++;									}									if(rcount%2==1 && rcount==lcount)										ret++;																	}							}						}					}				 /////				 done=true;				if(printing)						System.out.println("3.1 lMax="+lMax+",rMax="+rMax);				for(int i=n-1;i>=0 && !done;i--){					if(D[i]=='T' || D[i]=='B'){						lcount=0;						rcount=0;						continue;					}					if(D[i]=='R'){						rcount++;						if(rcount==rMax){							if(i-1>=0 && D[i-1]=='T'){								int k=i-1;								lcount=0;								while(k-1>=0 && D[k-1]=='L'){									lcount++;									k++;								}								if(lcount%2==1)									ret++;							}						}					} 				}					//////			}						System.out.println(ret);					in.close();					}   	}	
