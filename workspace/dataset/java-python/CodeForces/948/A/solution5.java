import java.util.*; public class Solution {	    public static void main(String[] args) {        Scanner scan = new Scanner(System.in);		int R = scan.nextInt();		int C = scan.nextInt();		scan.nextLine();		List<StringBuilder> result = new ArrayList<>();		boolean possible = true;		for(int i = 0; i < R; i++) {			StringBuilder res = new StringBuilder(scan.nextLine());			if(res.toString().contains("SW") || res.toString().contains("WS")) {				possible = false;				break;			}			char ch;			for(int j = 0; j < C; j++) {				ch = res.charAt(j);				if(ch == 'S') {					if(j > 0 && res.charAt(j-1) == '.') {						res.deleteCharAt(j-1);						res.insert(j-1, 'D');					}					if(j < C-1 && res.charAt(j+1) == '.') {						res.deleteCharAt(j+1);						res.insert(j+1, 'D');					}					if(i > 0) {						char up = result.get(i-1).charAt(j);						if(up == 'W') {							possible = false;							break;						} else						if(up == '.') {							result.get(i-1).deleteCharAt(j);							result.get(i-1).insert(j, 'D');						}					}				}				if(i > 0) {					if(ch == '.') {						char up = result.get(i-1).charAt(j);						if(up == 'S') {							res.deleteCharAt(j);							res.insert(j, 'D');						}					} else					if(ch == 'W') {						char up = result.get(i-1).charAt(j);						if(up == 'S') {							possible = false;							break;						}					}				}			}			if(possible == false) {				break;			}			result.add(res);		}		if(possible) {			System.out.println("Yes");			for(StringBuilder elem : result) {				System.out.println(elem);			}		} else {			System.out.println("No");		}    }		}
