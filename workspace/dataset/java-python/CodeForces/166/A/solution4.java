import java.io.*;import java.lang.*;import java.util.*; public class A166 {    public static void main(String[] args) throws IOException{        StringBuffer ans = new StringBuffer();        StringTokenizer st;        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));        st = new StringTokenizer(f.readLine());        int n = Integer.parseInt(st.nextToken());        int k = Integer.parseInt(st.nextToken());        point[] arr = new point[n];        for(int i = 0; i < n; i++){            st = new StringTokenizer(f.readLine());            arr[i] = new point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));        }        f.close();        Arrays.sort(arr);        point curr = arr[k-1];        int op = 0;        //System.out.println(Arrays.toString(arr));        for(int i = 0; i < n; i++){            if(arr[i].equals(curr)){                op++;            }        }          System.out.println(op);    }    public static class point implements Comparable<point>{        int x;        int y;        public point(int x,int y){            this.x = x;            this.y = y;        }        public String toString(){            return(x + " " + y);        }        public boolean equals(Object x){            point y = ((point)(x));            if (this.x == y.x && this.y == y.y){                return true;            }            return false;        }        public int hashCode(){            return Objects.hash(x,y);        }        public int compareTo(point other){            if(this.x < other.x || (this.x == other.x && this.y > other.y)){                return 1;            }else if(this.x == other.x && this.y == other.y){                return 0;            }            return -1;        }    } }
