 import java.util.*;  public class BruteForce{        public static Scanner in=new Scanner(System.in);       public static void main(String[]args){        HashMap<Integer,Integer>mp=new HashMap<Integer,Integer>();        ArrayList<Integer>list=new ArrayList<Integer>();        int n=in.nextInt();        for(int i=0;i<n;i++){            int cur=in.nextInt();            if(mp.containsKey(cur))                mp.put(cur,mp.get(cur)+1);            else                mp.put(cur,1);            list.add(cur);        }        Collections.sort(list);        int a=list.get(0);        int b=list.get(1);        int c=list.get(2);                HashSet<Integer>set=new HashSet<Integer>();        set.add(a);set.add(b);set.add(c);        if(set.size()==3){            long ans=mp.get(a)*mp.get(b)*mp.get(c);            System.out.println(ans);        }        if(set.size()==2){            Iterator<Integer>ptr=set.iterator();            int x=mp.get(ptr.next());            int y=mp.get(ptr.next());            int min=Math.min(x,y);            int max=Math.max(x,y);            if(min==1&&max==2)                System.out.println("1");            else{                int mpX=min;                int mpY=max;                if(mpX==2)                    System.out.println(mpY);                if(mpX==1){                    long ans=mpY--;                    ans*=mpY;                    ans/=2;                    System.out.println(ans);                }            }        }        if(set.size()==1){            long x=mp.get(a);            long ans=x*(x-1)*(x-2);            System.out.println(ans/6);        }            }}
