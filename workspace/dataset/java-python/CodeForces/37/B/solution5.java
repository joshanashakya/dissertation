 import java.io.FileInputStream;import java.io.FileNotFoundException;import java.io.PrintStream;import java.util.ArrayList;import java.util.Comparator;import java.util.List;import java.util.PriorityQueue;import java.util.Scanner; public class P037B { 	public class Spell {		private int pow;		private int dmg;		private int index;				public Spell(int pow, int dmg, int index) {			this.pow = pow;			this.dmg = dmg;			this.index = index;		} 		public int getPow() {			return pow;		}		public void setPow(int pow) {			this.pow = pow;		}		public int getDmg() {			return dmg;		}		public void setDmg(int dmg) {			this.dmg = dmg;		}		public int getIndex() {			return index;		}		public void setIndex(int index) {			this.index = index;		}	} 	public class Cast {		private int second; 		private int index;				public Cast(int second, int index) {			this.second = second;			this.index = index;		}				public int getSecond() {			return second;		}		public void setSecond(int second) {			this.second = second;		}		public int getIndex() {			return index;		}		public void setIndex(int index) {			this.index = index;		}	}		public void solve() {		/*		try {			System.setIn(new FileInputStream("data/037B/037B.in"));			System.setOut(new PrintStream("data/037B/037B.out"));		} catch (FileNotFoundException e) {			e.printStackTrace();		}		*/				// read input data		Scanner scanner = new Scanner(System.in);		String content = scanner.nextLine();		String[] tokens = content.split(" ");		int spellCount = Integer.parseInt(tokens[0]);		int maxBossHealth = Integer.parseInt(tokens[1]);		int regenerateBossHealth = Integer.parseInt(tokens[2]);				PriorityQueue<Spell> unavaillableSpells = new PriorityQueue<>(new Comparator<Spell>() {			@Override			public int compare(Spell spell1, Spell spell2) {				return spell2.getPow() - spell1.getPow();			}		});		PriorityQueue<Spell> availlableSpells = new PriorityQueue<>(new Comparator<Spell>() {			@Override			public int compare(Spell spell1, Spell spell2) {				return spell2.getDmg() - spell1.getDmg();			}		});				for (int spellIndex = 1; spellIndex <= spellCount; spellIndex++) {			content = scanner.nextLine();			tokens = content.split(" ");			unavaillableSpells.add(new Spell(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]), spellIndex));		}				scanner.close();				// declare and initialize variables		int currentBossHealth = maxBossHealth;		int previousBossHealth;		double currentBossPow;		boolean gameLost = false;		boolean spellCast = false;		int damage = 0;		int secondCount = 0;		List<Cast> casts = new ArrayList<>();				while (gameLost == false) {						// update boss status			previousBossHealth = currentBossHealth;			currentBossHealth -= damage;			currentBossHealth = Math.min(currentBossHealth + regenerateBossHealth, maxBossHealth);			currentBossPow = currentBossHealth * 100.0 / maxBossHealth;						// end if boss is dead			if (currentBossHealth <= 0) {				break;			}						// turn unavailable spells into available spells if criteria is met			while (!unavaillableSpells.isEmpty()) {				Spell spell = unavaillableSpells.peek();				if (spell.getPow() < currentBossPow) {					break;				}								availlableSpells.add(spell);				unavaillableSpells.remove();			}						// cast best available spell 			if (!availlableSpells.isEmpty()) {				Spell spell = availlableSpells.poll();				casts.add(new Cast(secondCount, spell.getIndex()));				damage += spell.getDmg();				spellCast = true;			} else {				spellCast = false;			}						// end game if no progress could be made			if (!(currentBossHealth < previousBossHealth || spellCast)) {				gameLost = true;			}			secondCount++;		}				System.out.println(gameLost ? "NO" : "YES");		if (gameLost == false) {			System.out.println(secondCount + " " + casts.size());			for (Cast cast : casts) {				System.out.println(cast.getSecond() + " " + cast.getIndex());			}		}	}		public static void main(String[] args) {		new P037B().solve();	}}
