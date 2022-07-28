import java.io.OutputStreamWriter;import java.io.BufferedWriter;import java.util.Comparator;import java.io.OutputStream;import java.io.PrintWriter;import java.util.Random;import java.io.Writer;import java.util.HashSet;import java.util.List;import java.io.IOException;import java.util.Arrays;import java.util.InputMismatchException;import java.util.ArrayList;import java.util.NoSuchElementException;import java.util.TreeSet;import java.math.BigInteger;import java.io.InputStream; /** * Built using CHelper plug-in * Actual solution is at the top * @author Alex */public class Main {	public static void main(String[] args) {		InputStream inputStream = System.in;		OutputStream outputStream = System.out;		InputReader in = new InputReader(inputStream);		OutputWriter out = new OutputWriter(outputStream);		TaskA solver = new TaskA();		solver.solve(1, in, out);		out.close();	}} class TaskA {    public void solve(int testNumber, InputReader in, OutputWriter out){	    int ncards = in.ri();	    IntPair[] cards = new IntPair[ncards];	    String[] translate = new String[]{"R", "G", "B", "Y", "W"};	    for(int i = 0; i < ncards; i++) {		    String temp = in.next();		    int first = ArrayUtils.find(translate, Character.toString(temp.charAt(0)));		    int second = temp.charAt(1) - '1';		    cards[i] = new IntPair(first, second);	    }	    int res = Integer.MAX_VALUE;	    for(int mask = 0; mask < 1024; mask++) {		    boolean works = true;		    for(int i = 0; i < cards.length; i++) {			    for(int j = i + 1; j < cards.length; j++) {				    if (cards[i].first == cards[j].first && cards[i].second == cards[j].second) continue;				    if (cards[i].first != cards[j].first && ((mask >> cards[i].first & 1) == 1 || (mask >> cards[j].first & 1) == 1)) continue;				    if(cards[i].second != cards[j].second && ((mask >> (cards[i].second + 5) & 1) == 1 || (mask >> (cards[j].second + 5) & 1) == 1)) continue;				    works = false;			    }		    }		    if (works) res = Math.min(Integer.bitCount(mask), res);	    }	    out.printLine(res);    }} class InputReader {	private InputStream stream;	private byte[] buf = new byte[1024];	private int curChar;	private int numChars;	private SpaceCharFilter filter; 	public InputReader(InputStream stream) {		this.stream = stream;	} 	public int read() {		if (numChars == -1)			throw new InputMismatchException();		if (curChar >= numChars) {			curChar = 0;			try {				numChars = stream.read(buf);			} catch (IOException e) {				throw new InputMismatchException();			}			if (numChars <= 0)				return -1;		}		return buf[curChar++];	}	public int ri(){		return readInt();	} 	public int readInt() {		int c = read();		while (isSpaceChar(c))			c = read();		int sgn = 1;		if (c == '-') {			sgn = -1;			c = read();		}		int res = 0;		do {			if (c < '0' || c > '9')				throw new InputMismatchException();			res *= 10;			res += c - '0';			c = read();		} while (!isSpaceChar(c));		return res * sgn;	}	public String readString() {		int c = read();		while (isSpaceChar(c))			c = read();		StringBuilder res = new StringBuilder();		do {			if (Character.isValidCodePoint(c))				res.appendCodePoint(c);			c = read();		} while (!isSpaceChar(c));		return res.toString();	} 	public boolean isSpaceChar(int c) {		if (filter != null)			return filter.isSpaceChar(c);		return isWhitespace(c);	} 	public static boolean isWhitespace(int c) {		return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;	}	public String next() {		return readString();	}	public interface SpaceCharFilter {		public boolean isSpaceChar(int ch);	}} class OutputWriter {	private final PrintWriter writer; 	public OutputWriter(OutputStream outputStream) {		writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));	}	public void close() {		writer.close();	}	public void printLine(int i) {		writer.println(i);	} } class IntPair implements Comparable<IntPair> {public int first, second;  	public IntPair(int first, int second) {		this.first = first;		this.second = second;	} 	public String toString() {		return "(" + first + "," + second + ")";	} 	public boolean equals(Object o) {		if (this == o) return true;		if (o == null || getClass() != o.getClass()) return false; 		IntPair intPair = (IntPair) o; 		return first == intPair.first && second == intPair.second; 	} 	public int hashCode() {		int result = first;		result = 31 * result + second;		return result;	} 	public int compareTo(IntPair o) {		if (first < o.first)			return -1;		if (first > o.first)			return 1;		if (second < o.second)			return -1;		if (second > o.second)			return 1;		return 0;	}} class ArrayUtils {	public static int find(String[] array, String value) {		for (int i = 0; i < array.length; i++) {			if (array[i].equals(value)) {				return i;			}		}		return -1;	}} 
