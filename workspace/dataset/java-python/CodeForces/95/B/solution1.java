// practice with rainboy
import java.io.*;
import java.util.*;

public class CF95B extends PrintWriter {
	CF95B() { super(System.out, true); }
	Scanner sc = new Scanner(System.in);
	public static void main(String[] $) {
		CF95B o = new CF95B(); o.main(); o.flush();
	}

	void fill(byte[] aa, int i, int n4, int n7) {
		while (n4-- > 0)
			aa[i++] = '4';
		while (n7-- > 0)
			aa[i++] = '7';
		println(new String(aa));
	}
	void main() {
		byte[] cc = sc.next().getBytes();
		int n = cc.length;
		if (n % 2 == 1) {
			byte[] aa = new byte[n + 1];
			fill(aa, 0, (n + 1) / 2, (n + 1) / 2);
			return;
		}
		int n4 = n / 2, n7 = n / 2;
		for (int i = 0; i < n; i++)
			if (cc[i] != '4' && cc[i] != '7') {
				if (cc[i] < '4' && n4 > 0) {
					cc[i] = '4';
					n4--;
					fill(cc, i + 1, n4, n7);
					return;
				}
				if (cc[i] < '7' && n7 > 0) {
					cc[i] = '7';
					n7--;
					fill(cc, i + 1, n4, n7);
					return;
				}
				if (i == 0) {
					byte[] aa = new byte[n + 2];
					fill(aa, 0, (n + 2) / 2, (n + 2) / 2);
					return;
				}
				if (cc[i - 1] == '4')
					n4++;
				else
					n7++;
				cc[i - 1]++;
				i -= 2;
			} else if (cc[i] == '4' && n4 > 0) {
				n4--;
			} else if (cc[i] == '7' && n7 > 0) {
				n7--;
			} else
				cc[i--]++;
		fill(cc, n, 0, 0);
	}
}

