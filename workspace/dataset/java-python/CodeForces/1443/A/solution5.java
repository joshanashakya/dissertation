import java.util.*; public class Main{    static boolean judge(int a,int b){        if(a%b==0||b%a==0){            return false;        }        return true;    }    public static void main(String[] args) {        Scanner sc=new Scanner(System.in);        int t=sc.nextInt();        while(t--!=0){            int n=sc.nextInt();            Queue<Integer> q=new LinkedList<>();            int i=4;            q.offer(i);            while(true){                if(q.size()==n)break;                i+=2;                int mid=q.element();                if(judge(mid,i)){                    q.add(i);                }else{                    q.remove();                    q.add(i);                }            }            for(int j=0;j<n;j++){                System.out.print(q.poll()+" ");            }            System.out.println();        }    }}			 				  			      	       			