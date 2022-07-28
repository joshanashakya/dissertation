import java.util.*;import java.io.*;  public class answer{        static int methodeOne(int[][] tab,int[][] origine,int n,int m){        int val = 0;        int valligne1 = 0,valligne2 = 0;        for(int i=0;i<n;i++){            valligne1 = 0;            valligne2 = 0;            for(int j=0;j<m;j++){                if(origine[i][j] != tab[i%2][j%2]) valligne1++;                if(origine[i][j] != tab[i%2][(j+1)%2]) valligne2++;            }            val += Math.min(valligne1,valligne2);        }        return val;    }        static int methodeTwo(int[][] tab,int[][] origine,int n,int m){        int val = 0;        int colone1 = 0,colone2 = 0;        for(int j=0;j<m;j++){            colone1 = 0;            colone2 = 0;            for(int i=0;i<n;i++){                if(origine[i][j] != tab[i%2][j%2]) colone1++;                if(origine[i][j] != tab[(i+1)%2][j%2]) colone2++;            }            val += Math.min(colone1,colone2);        }        return val;    }        static void operationOne(int[][] tab,int[][] origine,int n,int m){                int valligne1 = 0,valligne2 = 0;        for(int i=0;i<n;i++){            valligne1 = 0;            valligne2 = 0;            for(int j=0;j<m;j++){                if(origine[i][j] != tab[i%2][j%2]) valligne1++;                if(origine[i][j] != tab[i%2][(j+1)%2]) valligne2++;            }                        if(valligne1<=valligne2){                for(int j=0;j<m;j++){                    origine[i][j] = tab[i%2][j%2];                }            }            else{                for(int j=0;j<m;j++){                    origine[i][j] = tab[i%2][(j+1)%2];                }            }        }            }        static void operationTwo(int[][] tab,int[][] origine,int n,int m){                int colone1 = 0,colone2 = 0;        for(int j=0;j<m;j++){            colone1 = 0;            colone2 = 0;            for(int i=0;i<n;i++){                if(origine[i][j] != tab[i%2][j%2]) colone1++;                if(origine[i][j] != tab[(i+1)%2][j%2]) colone2++;            }                       if(colone1<=colone2){                for(int i=0;i<n;i++){                    origine[i][j] = tab[i%2][j%2];                }            }            else{                for(int i=0;i<n;i++){                    origine[i][j] = tab[(i+1)%2][j%2];                }            }        }            }            public static void main(String[] args) throws Exception{        HashMap<Character,Integer> h = new HashMap<Character,Integer>();        h.put('T',0);        h.put('G',1);        h.put('C',2);        h.put('A',3);        char[] a = new char[4];        a[0] = 'T';        a[1] = 'G';        a[2] = 'C';        a[3] = 'A';        Scanner sc = new Scanner(System.in);        int n = sc.nextInt();        int m = sc.nextInt();        String s = new String();        int[][] original = new int[n][m];        for(int i=0;i<n;i++){            s = sc.next();            for(int j=0;j<m;j++){                original[i][j] = h.get(s.charAt(j));            }        }                int minval = -1;        int[][] min = new int[2][2];        int[][] tab = new int[2][2];        int val1,val2,val;        for(int i=0;i<4;i++){            for(int j=0;j<4;j++){                for(int k=0;k<4;k++){                    for(int z=0;z<4;z++){                        TreeSet<Integer> ts = new TreeSet<Integer>();                        ts.add(i);                        ts.add(j);                        ts.add(k);                        ts.add(z);                        if(ts.size()!=4) continue;                        tab[0][0] = i;                        tab[0][1] = j;                        tab[1][0] = k;                        tab[1][1] = z;                        val1 = methodeOne(tab,original,n,m);                        val2 = methodeTwo(tab,original,n,m);                        val = Math.min(val1,val2);                        if(minval==-1 || minval>val){                            minval = val;                            min[0][0] = i;                            min[0][1] = j;                            min[1][0] = k;                            min[1][1] = z;                        }                                            }                }            }        }                val1 = methodeOne(min,original,n,m);        val2 = methodeTwo(min,original,n,m);        if(val1<=val2)            operationOne(min,original,n,m);        else operationTwo(min,original,n,m);        PrintWriter out = new PrintWriter(System.out);        for(int i=0;i<n;i++){            for(int j=0;j<m;j++){                out.print(a[original[i][j]]);            }            out.println("");        }        out.flush();            }}
