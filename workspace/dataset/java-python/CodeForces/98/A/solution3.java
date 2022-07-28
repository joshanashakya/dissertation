import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static int[][] bbb = new int[720][6];
	public static int sig = 0;
		

	public static void main(String[] args) {
		final Scanner scanner = new Scanner(System.in);
	final String line =	scanner.nextLine();
		aaa(new int[]{1,2,3,4,5,6}, 0);
		final Cube original = new Cube(line);
		final Set<Cube> cubes = new HashSet<>(720);
		for (int i = 0; i < 720; i++){
			cubes.add(format(original, bbb[i]));
		}
		final Set<Cube> aaaaaaaaaaa = new HashSet<>(720);
		final Iterator<Cube> iterator =		cubes.iterator();
		CUBE:while(iterator.hasNext()){
			final Cube cube = iterator.next();
			for(int x = 0; x < 4; x++){
				Cube xRotated = cube.rotateX(x);
				for(int y = 0; y < 4; y++){
					Cube yRotated = xRotated.rotateY(y);
					for(int z = 0; z < 4; z++){
						if(aaaaaaaaaaa.contains(yRotated.rotateZ(z))){
							continue CUBE;
						}
					}	
				}	
			}
			aaaaaaaaaaa.add(cube);
		}
		System.out.println(aaaaaaaaaaa.size());
	}
	
	public static Cube format(Cube cube, int[] index){
		final char[] chars = new char[6];
		for(int i = 0; i < 6; i++){
			chars[i] = cube.nums.charAt(index[i] - 1);
		}
		return new Cube(new String(chars));
	}
	
	public static void aaa(int[] array, int a){
		for (int j=a; j< 6; j++){
			int tmp;
			tmp = array[j];
			array[j] = array[a];
			array[a] = tmp;
			aaa(array, a+1);
			tmp = array[j];
			array[j] = array[a];
			array[a] = tmp;
		}
		if ( a == 6 ){
			bbb[sig] = array.clone();
			sig ++;
		}
	}
	

public static class Cube {
	public final String nums;

	public Cube(final String str) {
		if(str.length()!=6){
			throw new IllegalArgumentException();
		}
		nums = str;
	}

	public Cube rotateX( int times) {
if(times ==0){
	return this;
}
		char[] chars = nums.toCharArray();
		for(int i = 0; i < times; i++){
		char tmp;
		tmp = chars[5];
		chars[5] = chars[3];
		chars[3] = chars[0];
		chars[0] = chars[1];
		chars[1] = tmp;
		}
		return new Cube(new String(chars));
	}

	public Cube rotateY(int times) {
		if(times ==0){
			return this;
		}
		char[] chars = nums.toCharArray();
		for(int i = 0; i < times; i++){
		char tmp;
		tmp = chars[2];
		chars[2] = chars[0];
		chars[0] = chars[4];
		chars[4] = chars[5];
		chars[5] = tmp;
		}
		return new Cube(new String(chars));
	}

	public Cube rotateZ(int times) {
		if(times ==0){
			return this;
		}
		char[] chars = nums.toCharArray();
		for(int i = 0; i < times; i++){
		char tmp;
		tmp = chars[3];
		chars[3] = chars[2];
		chars[2] = chars[1];
		chars[1] = chars[4];
		chars[4] = tmp;
		}
		return new Cube(new String(chars));
	}

	public String getId(){
		return nums;
	}
	
	@Override
	public int hashCode() {
		return nums.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cube other = (Cube) obj;
		if (nums == null) {
			if (other.nums != null)
				return false;
		} else if (!nums.equals(other.nums))
			return false;
		return true;
	}
	
	public String toString(){
		return nums;
	}


	
}


}

 			 			  	 			  			 					    	
