import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader; public class test{	int red=0;	int blue=0;	int green=0;	int yellow=0;    public static void main(String[] args) throws IOException{        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));        String s=br.readLine();        char[] arr=s.toCharArray();        int n=s.length();        test t=new test();        for(int i=0;i<n;i++) {        	if(arr[i]=='!') {        		if(t.method(arr,i,'R')) {        			continue;        		}        		else if(t.method(arr,i,'B')) {        			continue;        		}        		else if(t.method(arr,i,'G')) {        			continue;        		}        		else if(t.method(arr,i,'Y')) {        			continue;        		}        	}        }        String res=new String(arr);        System.out.println(t.red+" "+t.blue+" "+t.yellow+" "+t.green);        }    public boolean method(char[] arr,int index,char c) {    	if(index>=arr.length) {    		return true;    	}    	int n=arr.length;    	if(arr[index]=='!') {    		if(index+1<n && arr[index+1]==c) {    			return false;    		}    		if(index+2<n && arr[index+2]==c) {    			return false;    		}    		if(index+3<n && arr[index+3]==c) {    			return false;    		}    		if(index-1>=0 && arr[index-1]==c) {    			return false;    		}    		if(index-2>=0 && arr[index-2]==c) {    			return false;    		}    		if(index-3>=0 && arr[index-3]==c) {    			return false;    		}    		arr[index]=c;    		if(c=='R') {    			red++;    		}    		else if(c=='B') {    			blue++;    		}    		else if(c=='G') {    			green++;    		}    		else {    			yellow++;    		}    		boolean b=method(arr,index+4,c);    		if(!b) {    			arr[index]='!';    			if(c=='R') {        			red--;        		}        		else if(c=='B') {        			blue--;        		}        		else if(c=='G') {        			green--;        		}        		else {        			yellow--;        		}    		}    		return b;    	}    	if(arr[index]==c) {    		return method(arr,index+4,c);    	}    	return false;    	    }    }
