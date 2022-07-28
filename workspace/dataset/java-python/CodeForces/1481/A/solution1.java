import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int tt = sc.nextInt();
		while(tt-->0) {
			int x = sc.nextInt(),y = sc.nextInt();
			char[] str = sc.next().toCharArray();
			int maxx=0,maxy=0,minx=0,miny=0;
			for(char c:str) {
				if(c=='R')maxx++;
				else if(c=='L')minx--;
				else if(c=='U')maxy++;
				else miny--;
			}
			System.out.println(maxx>=x&&minx<=x&&maxy>=y&&miny<=y?"Yes":"No");
		}
		sc.close();
	}
}

