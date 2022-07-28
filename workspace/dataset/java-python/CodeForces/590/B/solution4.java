import java.io.*;import java.util.StringTokenizer; public class Main {     private static double eps = 1e-15;     private static class Vector {        public double x;        public double y;    }     private static double calc( Vector v1, Vector v2, double v ) {        double d = 4. * ( v1.x * v2.x + v1.y * v2.y ) * ( v1.x * v2.x + v1.y * v2.y ) -                4. * ( v2.x * v2.x + v2.y * v2.y ) * ( v1.x * v1.x + v1.y * v1.y - v * v );         double z1 = ( 2 * ( v1.x * v2.x + v1.y * v2.y ) + Math                .sqrt( d ) ) / ( 2.0 * ( v2.x * v2.x + v2.y * v2.y ) + eps );        double z2 = ( 2 * ( v1.x * v2.x + v1.y * v2.y ) - Math                .sqrt( d ) ) / ( 2.0 * ( v2.x * v2.x + v2.y * v2.y ) + eps );        return Math.max( z1, z2 );    }     public static void main( String[] args ) {        InputReader scan = new InputReader( System.in );        PrintWriter writer = new PrintWriter( System.out );        double x1 = scan.nextInt();        double y1 = scan.nextInt();        double x2 = scan.nextInt();        double y2 = scan.nextInt();         double v = scan.nextInt();        double t = scan.nextInt();         Vector vec[] = new Vector[ 2 ];        for ( int i = 0; i < 2; ++i ) {            vec[ i ] = new Vector();            vec[ i ].x = scan.nextInt();            vec[ i ].y = scan.nextInt();        }         Vector tmp = new Vector();        tmp.x = x2 - x1;        tmp.y = y2 - y1;        double dist = Math.sqrt( tmp.x * tmp.x + tmp.y * tmp.y );        tmp.x /= dist + eps;        tmp.y /= dist + eps;         double res = 0;         double z = calc( vec[ 0 ], tmp, v );        tmp.x *= z;        tmp.y *= z;        double len = Math.sqrt( tmp.x * tmp.x + tmp.y * tmp.y );        if ( len * t >= dist ) {            res = dist / ( len + eps );        } else {            tmp.x = x2 - x1 + ( vec[ 1 ].x - vec[ 0 ].x ) * t;            tmp.y = y2 - y1 + ( vec[ 1 ].y - vec[ 0 ].y ) * t;            dist = Math.sqrt( tmp.x * tmp.x + tmp.y * tmp.y );            tmp.x /= dist + eps;            tmp.y /= dist + eps;             z = calc( vec[ 1 ], tmp, v );            tmp.x *= z;            tmp.y *= z;            len = Math.sqrt( tmp.x * tmp.x + tmp.y * tmp.y );            res = dist / ( len + eps );        }         writer.printf( "%.09f", res );        writer.close();    }     private static class InputReader {        public BufferedReader reader;        public StringTokenizer tokenizer;         public InputReader( InputStream stream ) {            reader = new BufferedReader( new InputStreamReader( stream ), 32768 );            tokenizer = null;        }         public String next() {            while ( tokenizer == null || !tokenizer.hasMoreTokens() ) {                try {                    tokenizer = new StringTokenizer( reader.readLine() );                } catch ( IOException e ) {                    throw new RuntimeException( e );                }            }            return tokenizer.nextToken();        }         public int nextInt() {            return Integer.parseInt( next() );        }         public long nextLong() {            return Long.parseLong( next() );        }    }}