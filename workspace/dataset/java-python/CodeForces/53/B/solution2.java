import java.io.*;import java.util.*;import java.util.HashSet;import java.util.Scanner;import java.util.Set;import java.util.ArrayList;import java.util.Collections;import java.util.HashMap;import java.util.Map;import java.text.DecimalFormat;import java.lang.Math;import java.util.Iterator; public class b99{	public static int bSearch(int[] a,int ele){	    int s = 0;	    int e = a.length-1;	    while(s<=e){	        int m = (int)s+(int)(e-s)/2;	        if(a[m]==ele){	            return a[m];	        }	        else if(a[m]>ele){	            e = m-1;	        }	        else{	            s = m+1;	        }	    }	    return a[e];	}	public static void main(String[] args){		Scanner sc = new Scanner(System.in);		int hh = sc.nextInt();		int ww = sc.nextInt();		long h = (long)hh;		long w = (long)ww;		int[] a = new int[30];		for(int i = 0; i < 30; i++){		   a[i] = (int)Math.pow(2, i); 		}		if(h>=w){		    w = bSearch(a, (int)w);		    if(w>=4){		        h = Math.min(h ,(5*w)/4);		    }		    else{		        while((float)h/w > 1.25){		            if(((float)h/w)<=1.25 && ((float)h/w)>=0.8){        		        h = h;        		    }        		    else{        		        h = h-1;        		    }		        }    		}		}		else{		    h = bSearch(a,(int)h);		    if(h>=4){		        w = Math.min(w ,(5*h)/4);		    }		    else{    		    while((float)h/w < 0.8){		            if(((float)h/w)<=1.25 && ((float)h/w)>=0.8){        		        w = w;        		    }        		    else{        		        w = w-1;        		    }		        }    		}    		if(w>h && w<hh){    		    long temp = h;    		    h = w;    		    w = temp;    		}		}		System.out.println(h+" "+w);	}	}
