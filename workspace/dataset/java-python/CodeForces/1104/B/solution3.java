import java.util.*; public class GameWithString { 	public static void main(String[] args) {				Scanner scan = new Scanner(System.in);				String inputString = scan.nextLine();				StringBuffer gameString = new StringBuffer();				int playerTurn = 0;				gameString.append(inputString);				for (int i = 1; i < gameString.length(); i++) {						if (gameString.charAt(i) == gameString.charAt(i-1)) {								gameString.deleteCharAt(i-1);				gameString.deleteCharAt(i-1);								playerTurn++;								i = Math.max(i-2, 0);						}		}						if (playerTurn%2 == 0) {			System.out.println("No");		}		else {			System.out.println("Yes");		}				//System.out.println(gameString);				scan.close();			} }
