import java.util.HashSet;
import java.util.Scanner;

public class p1496B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        for(int t=sc.nextInt();t-->0;) {
            int n=sc.nextInt(),k=sc.nextInt(),x,max=-1;
            HashSet<Integer> hs=new HashSet<>();
            while(n-->0) {hs.add(x=sc.nextInt()); max=Math.max(x,max);}
            int mex=0;
            while(hs.contains(mex)) mex++;
            if(mex>max||k==0) sb.append(hs.size()+k+"\n");
            else {
                hs.add((int)Math.ceil((max+mex)/2.0));
                sb.append(hs.size()+"\n");
            }
        }
        System.out.println(sb);
    }
}
