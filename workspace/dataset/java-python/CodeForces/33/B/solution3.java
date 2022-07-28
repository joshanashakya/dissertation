import java.util.*;import java.io.*; public class Main { 	public static int comunMaisProx(int a, int b, int[][] D) {		int posiDoMenor = -1;		int menorValorSomado = Integer.MAX_VALUE;		for (int i = 0; i < D.length; i++) {			if (D[a][i] != Integer.MAX_VALUE && i != a && i != b) {				if (D[b][i] != Integer.MAX_VALUE) {					if (D[a][i] + D[b][i] < menorValorSomado) {						menorValorSomado = D[a][i] + D[b][i];						posiDoMenor = i;					}				} else {					int aux = comunMaisProx(b, i, D);					if (aux != -1 && menorValorSomado > D[b][aux] + D[i][aux]) {						posiDoMenor = aux;						menorValorSomado = D[b][aux] + D[i][aux];					}				} 			}		}		return posiDoMenor;	} 	public static void main(String[] args) { 	  		FastReader in = new FastReader(); 		String st1=in.nextLine();		String st2=in.nextLine();				GraphMatriz grafo= new GraphMatriz(26);				boolean falhou=false;		if (st1.length()!=st2.length()) {			falhou=true;		}						int n=Integer.parseInt(in.nextLine());				for (int i = 0; i < n; i++) {			String aux= in.nextLine();			int letra1=aux.charAt(0) -97;			int letra2=aux.charAt(2) -97;			if (letra1!=letra2) {				grafo.setEdge(letra1, letra2, Integer.parseInt(aux.split(" ")[2])); 			}			}				int[][] D=new int[26][26];		D=grafo.floiyd(D);		int total=0;		StringBuffer sb=new StringBuffer();				if (!falhou) {					for (int i = 0; i < st1.length(); i++) {			if (st1.charAt(i)!=st2.charAt(i)) {				if (grafo.dist(st1.charAt(i)-97,st2.charAt(i)-97)== Integer.MAX_VALUE&&grafo.dist(st2.charAt(i)-97,st1.charAt(i)-97)== Integer.MAX_VALUE) {					if (comunMaisProx(st1.charAt(i)-97,st2.charAt(i)-97,D)==-1) {						falhou =true;						break;					}else {						int comunMaisProx=comunMaisProx(st1.charAt(i)-97,st2.charAt(i)-97,D);						total=total+grafo.dist(st1.charAt(i)-97,comunMaisProx)+grafo.dist(st2.charAt(i)-97, comunMaisProx);						char aux=(char) (comunMaisProx+97);						sb.append(aux);					}									}else {					int dist=D[st1.charAt(i)-97][st2.charAt(i)-97];					int tsid=D[st2.charAt(i)-97][st1.charAt(i)-97];					int aux=0;					char aux2=' ';					if (dist>tsid) {						aux2=st1.charAt(i);						aux=tsid;					}else {						aux2=st2.charAt(i);						aux=dist;					}															if (comunMaisProx(st1.charAt(i)-97,st2.charAt(i)-97,D)!=-1) {						int comunMaisProx=comunMaisProx(st1.charAt(i)-97,st2.charAt(i)-97,D);						if (grafo.dist(st1.charAt(i)-97, comunMaisProx)+grafo.dist(st2.charAt(i)-97, comunMaisProx)<aux) {							aux=grafo.dist(st1.charAt(i)-97, comunMaisProx)+grafo.dist(st2.charAt(i)-97, comunMaisProx);							aux2= (char) (comunMaisProx+97);						}					}					//int aux=Math.min(dist, tsid);					sb.append(aux2);					total=total+aux;					}			}else {				sb.append(st1.charAt(i));			}		}		}				if (falhou) {			System.out.println(-1);		}else {							System.out.println(total);		System.out.println(sb);		}	} } class FastReader {	BufferedReader br;	StringTokenizer st; 	public FastReader() {		br = new BufferedReader(new InputStreamReader(System.in));	} 	String next() {		while (st == null || !st.hasMoreElements()) { 			try {				st = new StringTokenizer(br.readLine());			} catch (IOException e) {				e.printStackTrace();			}		}		return st.nextToken();	} 	int nextInt() {		return Integer.parseInt(next()); 	} 	long nextLong() {		return Long.parseLong(next());	} 	double nextDouble() {		return Double.parseDouble(next());	} 	String nextLine() {		String str = "";		try {			str = br.readLine();		} catch (IOException e) {			e.printStackTrace();		}		return str;	}}     class GraphMatriz {	int[][] matriz;	int numEdge;	int[] Mark;	// int[] grauDosVer;	// int contCiclos;	// fica esperto com o numero de matriz[0].lenght	ArrayList<Integer> aux;// gurada Os Vertices Q Foram Visitados Nessa Chamada 	public GraphMatriz(int n) {		matriz = new int[n][n];		for (int i = 0; i < matriz.length; i++) {			for (int j = 0; j < matriz.length; j++) {				if (i == j) {					matriz[i][j] = 0;				} else {					matriz[i][j] = Integer.MAX_VALUE;// infinito				}			}		}		numEdge = 0;		Mark = new int[n];		aux = new ArrayList<Integer>();		// grauDosVer= new int[n];		// contCiclos = 0; 	} 	public void setEdge(int v1, int v2, int peso) {// introduz a aresta		if (matriz[v1][v2] > peso) { 			matriz[v1][v2] = peso;						// grauDosVer[v1]++;			// grauDosVer[v2]++;		}	} 	/*	 * public void graphTraverseD(int ver) {	 * 	 * for (int v = 0; v < Mark.length/* n(g) ; v++) { setMark(v, 0); }	 * 	 * for (int v = 0; v < Mark.length; v++) { aux.clear(); if (getMark(v) == 0) {	 * DFS(v); for (int i = 0; i < aux.size(); i++) { if (grauDosVer[	 * aux.get(i)]!=2) { break; }else if (i==aux.size()-1) { //contCiclos++; } } } }	 * }	 */ 	public void graphTraverseB(int ver) {		// ordemTraver.clear(); 		for (int v = 0; v < Mark.length/* n(g) */; v++) {			setMark(v, 0);		} 		for (int v = ver, i = 0; i < Mark.length; v++, i++) {			if (v >= Mark.length) {				v = 0;			}			if (getMark(v) == 0) {				BFS(v);			}		}	} 	public void BFS(int start) {		Queue<Integer> Q = new LinkedList<>();		Q.add(start);		setMark(start, 1);		while (Q.size() > 0) {			int v = Q.remove();			// ordemTraver.add(v);			int w = first(v);			while (w < Mark.length) {				if (getMark(w) == 0) {					setMark(w, 1);					Q.add(w);				}				w = next(v, w);			}		}	} 	public void DFS(int v) { 		// ordemTraver2[quantOT2] = v;		// quantOT2++;		// ordemTraver.add(v);		setMark(v, 1);		// System.out.println(v);		aux.add(v);		int w = first(v);		while (w < Mark.length) {			if (getMark(w) == 0) {				DFS(w);			}			w = next(v, w);		}	} 	/*	 * public int getContCiclos() { return contCiclos; }	 */ 	public int first(int v) {		for (int i = 0; i < Mark.length; i++) {			if (matriz[v][i] != 0) {				return i;			}		}		return Mark.length;	} 	public int next(int v, int w) {		for (int i = w + 1; i < Mark.length; i++) {			if (matriz[v][i] != 0) {				return i;			}		}		return Mark.length;	} 	public void setMark(int v, int visited) {		Mark[v] = visited;	} 	public int getMark(int v) {		return Mark[v];	} 	/*	 * public StringBuffer ImprimirTraver() { StringBuffer st = new StringBuffer();	 * 	 * for (int i = 0; i < ordemTraver.size() - 1; i++) {	 * st.append(ordemTraver.get(i) + " "); }	 * st.append(ordemTraver.get(ordemTraver.size() - 1)); return st; }	 *///	public int[] dijstra(int s, int[] D) {//		int[] pais = new int[matriz[0].length];//		for (int i = 0; i < matriz[0].length; i++) {//			D[i] = (int) Math.pow(2, 31);// "infinito"//			pais[i] = -1;// dizendo que ninguem tem pai ainda//			setMark(i, 0);//		}////		Heap H = new Heap(matriz[0].length);//		H.insert(s, s, 0);//		D[s] = 0;////		for (int i = 0; i < matriz[0].length; i++) {//			int p;//			int v;//			do {//				HeapNode aux = H.removeMin();//				if (aux == null) {//					return null;//				}//				p = aux.getPai();//				v = aux.getVertice();////			} while (!(getMark(v) == 0));////			setMark(v, 1);//			pais[v] = p;//			int w = first(v);////			while (w < matriz[0].length) {//				if (getMark(w) != 1 && D[w] > D[v] + matriz[w][v]&&D[v] + matriz[w][v]>=0) {// distanca entre dois pontos//					D[w] = D[v] + matriz[w][v];//					H.insert(w, v, D[w]);//				}//				w = next(v, w);////			}////		}//		return pais;//	} 	public int[][] floiyd(int[][] D) { 		/*		 * for (int i = 0; i < D.length; i++) { for (int j = 0; j < D.length; j++) { if		 * (i==j) { D[i][j]=0; }else if (dist(i,j)!=0) { D[i][j]=dist(i,j); }else {		 * D[i][j]=101;//infinito } } }		 */ // levei essa construção para dentro do construtor		D = matriz;		for (int k = 0; k < D.length; k++) {			for (int i = 0; i < D.length; i++) {				for (int j = 0; j < D.length; j++) {					if (D[i][k] != Integer.MAX_VALUE && D[k][j] != Integer.MAX_VALUE && D[i][j] > D[i][k] + D[k][j]) {						D[i][j] = D[i][k] + D[k][j];					}				}			}		}		return D;	} 	public int dist(int x, int y) {		return matriz[x][y];	} //	public void prim(int[] D, int[] pais) {//		//		for (int i = 0; i < matriz[0].length; i++) {//			D[i] = (int) Math.pow(2, 31);// "infinito"//			pais[i] = -1;// dizendo que ninguem tem pai ainda//			setMark(i, 0);//		}////		Heap H = new Heap(matriz[0].length);//		H.insert(0, 0, 0);//		D[0] = 0;////		for (int i = 0; i < matriz[0].length; i++) {//			int p;//			int v;//			do {//				HeapNode aux = H.removeMin();//				if (aux == null) {//					return ;//				}//				p = aux.getPai();//				v = aux.getVertice();////			} while (!(getMark(v) == 0));////			setMark(v, 1);//			pais[v] = p;//			int w = first(v);////			while (w < matriz[0].length) {//				if (getMark(w) != 1 && D[w] > matriz[w][v]&&D[v] + matriz[w][v]>=0) {// distanca entre dois pontos//					D[w] =  matriz[w][v];//					H.insert(w, v, D[w]);//				}//				w = next(v, w);////			}////		}//		//	} } 			 			 		 			 		 	  		 	 			
