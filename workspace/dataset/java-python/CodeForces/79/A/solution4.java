//package test; import java.util.*;	import java.io.*;public class ex17 {	public static void main (String []args) throws IOException { 		Scanner sc = new Scanner (System.in);		int x = sc.nextInt();		int y = sc.nextInt();		int count = 0;		while (true){			if (count % 2 == 0){				if (x >= 2) {										if (y >= 2){						y -= 2;						x -= 2;					}					else {						System.out.print("Hanako");	break;					}				}				else if (x == 1){					x = 0;					if (y >= 12) {						y -= 12;					}					else {						System.out.print("Hanako");	break;					}				}				else {					if (y >= 22) y -= 22;					else {						System.out.print("Hanako");	break;					}				}				count ++;			}			else {				if (y >= 22) y -= 22;				else if (y >= 12){					if (x >= 1){						y -= 12;						x -= 1;					}					else {						System.out.print("Ciel");	break;					}				}				else{					if (x >= 2) {												if (y >= 2){							y -= 2;							x -= 2;						}						else {							System.out.print("Ciel");	break;						}					}					else if (x == 1){						x = 0;						if (y >= 12) {							y -= 12;						}						else {							System.out.print("Ciel");	break;						}					}					else {						if (y >= 22) y -= 22;						else {							System.out.print("Ciel");	break;						}					}									}								count ++;				}					}																				sc.close();			}		}