import java.util.*;import java.util.Scanner; public class Main {    public static void main(String[] args) {        Scanner input = new Scanner(System.in);        int n = input.nextInt();        int qi=input.nextInt();        qi--;        int qj=input.nextInt();        qj--;        int ki=input.nextInt();        ki--;        int kj=input.nextInt();        kj--;;        int di=input.nextInt();        di--;        int dj=input.nextInt();        dj--;        int d1=qi+qj;        int d2=qi-qj+n-1;        boolean visited[][]=new boolean[n][n];        boolean res=check(visited,n,qi,qj,d1,d2,ki,kj,di,dj);        if(res){            System.out.println("YES");        }        else{            System.out.println("NO");        }    }    public static boolean check(boolean visited[][],int n,int qi,int qj,int d1,int d2,int ki,int kj,int di,int dj){        if(ki<0||kj<0||ki>=n||kj>=n){            return false;        }        else if(visited[ki][kj]){            return false;        }        visited[ki][kj]=true;        int dd1=ki+kj;        int dd2=ki-kj+n-1;        if(ki==qi||kj==qj||dd1==d1||dd2==d2){            return false;        }        if(ki==di&&kj==dj){            return true;        }        return  check(visited,n,qi,qj,d1,d2,ki+1,kj,di,dj)||                check(visited,n,qi,qj,d1,d2,ki-1,kj,di,dj)||                check(visited,n,qi,qj,d1,d2,ki,kj+1,di,dj)||                check(visited,n,qi,qj,d1,d2,ki,kj-1,di,dj)||                check(visited,n,qi,qj,d1,d2,ki+1,kj+1,di,dj)||                check(visited,n,qi,qj,d1,d2,ki+1,kj-1,di,dj)||                check(visited,n,qi,qj,d1,d2,ki-1,kj+1,di,dj)||                check(visited,n,qi,qj,d1,d2,ki-1,kj-1,di,dj);    } }  