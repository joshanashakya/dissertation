import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader; public class kjhg {    public static void main(String[] args) throws IOException {        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));        String f=a.readLine();        String d[]=f.split(" ");        System.out.print(d[0].charAt(0));        for (int i = 1; i <d[0].length(); i++) {            if (d[0].charAt(i)<d[1].charAt(0)){                System.out.print(d[0].charAt(i));            }else{                break;            }         }        System.out.println(d[1].charAt(0));    }}