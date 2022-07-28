import java.io.*;
import java.util.*;
import java.math.*;

public class D{
    static ArrayList<BigInteger> h, t, a, id;
    static TreeMap<BigInteger, Integer> cnt;
    static BigInteger last = new BigInteger( "-1" );
    static boolean visited = false;
    static Fraction acc = new Fraction( 1 );

    public static void init(){
        h = new ArrayList<BigInteger>();
        t = new ArrayList<BigInteger>();
        a = new ArrayList<BigInteger>();
        id = new ArrayList<BigInteger>();
        cnt = new TreeMap<BigInteger, Integer>();
    }

    public static Fraction solve(){
        Fraction ans = new Fraction( 0 );
        Fraction acc = new Fraction( 1 );
        int sz = h.size();
        boolean flag = true;
        for(int i = sz-1; i >= 0; --i){
            Fraction ht = new Fraction( h.get(i), t.get(i) );
            if(flag){
                acc.multiply( ht );
                //acc.reduce();
            }
            ans.add( new Fraction( a.get(i) ) );
            ans.multiply( ht );
            ans.add(new Fraction( a.get(i).multiply( t.get(i).subtract( h.get(i) ) ), t.get(i) ));
            if(id.get(i).equals(last)){
                Fraction mul = new Fraction(1);
                mul.subtract( acc );
                mul.inv();
                ans.multiply( mul );
                flag = false;
            }
            //ans.reduce();
        }
        return ans;
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        BigInteger n = new BigInteger( br.readLine() );
        BigInteger two = new BigInteger( "2" );
        BigInteger cur = BigInteger.ONE;
        init();
        while( !cur.equals( BigInteger.ZERO ) ){
            id.add( cur );
            int count = cnt.containsKey( cur ) ? cnt.get( cur ) : 0;
            cnt.put( cur, count + 1 );
            if( count + 1 == 2 ){
                last = cur;
                break;
            }
            int k = 0;
            while( cur.compareTo( n ) < 0 ){
                cur = cur.multiply( two );
                ++k;
            }
            t.add( cur );
            cur = cur.subtract( n );
            h.add( cur );
            a.add( new BigInteger( String.valueOf(k) ) );
        }
        Fraction ans = solve();
        ans.reduce();
        System.out.println( ans );/**/
    }

    static class Fraction{
        private BigInteger num, den;
        
        public Fraction( int num, int den ){
            this.num = new BigInteger( String.valueOf(num) );
            this.den = new BigInteger( String.valueOf(den) );
        }
        public Fraction( int num ){
            this( num, 1 );
        }
        public Fraction( BigInteger num, BigInteger den ){
            this.num = num;
            this.den = den;
        }
        public Fraction( BigInteger num ){
            this( num, BigInteger.ONE );
        }
    
        public void add( Fraction o ){
            num = num.multiply( o.den ).add( o.num.multiply( den ) );
            den = den.multiply( o.den );
        }
        public void subtract( Fraction o ){
            num = num.multiply( o.den ).subtract( o.num.multiply( den ) );
            den = den.multiply( o.den );
        }
        public void multiply( Fraction o ){
            num = num.multiply( o.num );
            den = den.multiply( o.den );
        }
        public void inv(){
            BigInteger aux = num;
            num = den;
            den = aux;
        }
        public BigInteger get_gcd( BigInteger a, BigInteger b ){
            BigInteger xx = BigInteger.ZERO;
            BigInteger y = BigInteger.ZERO;
            BigInteger x = BigInteger.ONE;
            BigInteger yy = BigInteger.ONE;
            BigInteger q, t;
            while(!b.equals( BigInteger.ZERO )) {
                q = a.divide( b );
                t = b;
                b = a.mod( b );
                a = t;
                t = xx;
                xx = x.subtract( q.multiply( xx ) );
                x = t;
                t = yy;
                yy = y.subtract( q.multiply( yy ) );
                y = t;
            }
            return a;
        }
        public void reduce(){
            BigInteger g = num.gcd(den);
            num = num.divide( g );
            den = den.divide( g );
        }
        public String toString(){
            return num.toString() + "/" + den.toString();
        }
    }
}
