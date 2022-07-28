import java.util.*;

public class A {
	static char[] build;
	static char[] gems;
	static HashSet<String> seen;
	static boolean[] used;
	static int count;
	public static void main(String[] args) {
		
		Scanner qwe = new Scanner(System.in);
		gems =qwe.next().toCharArray();
		
		seen = new HashSet<String>();
		used = new boolean[gems.length];
		build = new char[gems.length];
		count = 0;
		doit(0);
		
		System.out.println(count);
		
	}
	
	static void doit(int index){
		if(index == gems.length){
			String b = String.valueOf(build);
			if(!seen.contains(b)){
				
				//System.out.println(b);
				
				count++;
				seen.add(b);
				
				ArrayDeque<char[]> dq = new ArrayDeque<char[]>();
				dq.add(build);
				
				while(!dq.isEmpty()){
					
					char[] at = dq.poll();
					
					//System.out.println("at: " + String.valueOf(at));
					
					
					char[] go = rotateR(at);
					
					if(!seen.contains(String.valueOf(go))){
						seen.add(String.valueOf(go));
						dq.add(go);
					}
					
					go = rotateU(at);
					
					if(!seen.contains(String.valueOf(go))){
						seen.add(String.valueOf(go));
						dq.add(go);
					}
					
					
				}
				
				
				
			}
			
		}
		
		for(int place = 0; place < gems.length; place++){
			if(!used[place]){
				used[place] = true;
				
				build[index] = gems[place];
				doit(index+1);
				
				used[place] = false;
			}
		}
		
		
	}
	
	
	static char[] rotateR(char[] cube){
		char[] ret = Arrays.copyOf(cube, cube.length);
		
		ret[0] = cube[1];
		ret[1] = cube[2];
		ret[2] = cube[3];
		ret[3] = cube[0];
		
		return ret;
	}
	
	static char[] rotateU(char[] cube){
		char[] ret = Arrays.copyOf(cube, cube.length);
		
		ret[1] = cube[4];
		ret[4] = cube[3];
		ret[3] = cube[5];
		ret[5] = cube[1];
		
		return ret;
		
	}

}

