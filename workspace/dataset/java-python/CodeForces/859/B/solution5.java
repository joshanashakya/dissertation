import java.util.*;   public class test {     public static void main(String[] args)  {        Scanner scanner = new Scanner(System.in);        int numberOfBlocks = scanner.nextInt();		int circuit = -1;        int findThatHasSquare = numberOfBlocks;		if(Math.sqrt(findThatHasSquare)%1 == 0){			circuit = (int) Math.sqrt(findThatHasSquare) * 4;		}		else{			findThatHasSquare = numberOfBlocks;			while(true){				if(Math.sqrt(findThatHasSquare)%1 == 0){					break;				}				findThatHasSquare--;			}		}		if(circuit == -1){    		int sqrt = (int) Math.sqrt(findThatHasSquare);    		circuit = sqrt * 4;    		int restBlocks = numberOfBlocks - findThatHasSquare;    		while(true){    			if(restBlocks-sqrt > 0){    				restBlocks =- sqrt;    				circuit += 2;    			}	    			else{    				circuit += 2;    				break;    			}    		}		}		System.out.println(circuit);	    }}
