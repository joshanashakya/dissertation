import java.util.ArrayList;import java.util.Arrays;import java.util.Collections;import java.util.List;import java.util.Scanner; public class A19 { 	public static void main(String[] args) {    Scanner scan = new Scanner(System.in);    List <String> teams= new ArrayList<String>();    List <Integer> scores=new ArrayList<Integer>();  String team_game2="";  String sscore1="";  String sscore2="";  int score1,score2;  int j;	int n=scan.nextInt();	int n2=n*(n-1)/2;	for(int i=0;i<n;i++) 		scores.add(0);	scan.nextLine();	for(int i=0;i<n;i++)	{		teams.add(scan.nextLine());	}	int []points = new int[n];		int []diff = new int[n];		int []goals = new int[n];		for(int i=0; i<n2;i++){	sscore1="";	sscore2="";	team_game2="";	String[] line=scan.nextLine().split("-");	String team_game=line[0];	for(j=0;line[1].charAt(j)!=' ';j++)		 team_game2=team_game2+line[1].charAt(j);	j++;	for(;line[1].charAt(j)!=':';j++)		sscore1=sscore1+line[1].charAt(j);	score1=Integer.parseInt(sscore1); 	j++;	for(;j<line[1].length();j++)		sscore2=sscore2+line[1].charAt(j);	score2=Integer.parseInt(sscore2);		if(score1<score2)	{		for(int k=0;k<n;k++) {		if (team_game2.equals(teams.get(k))){			points[k] +=  3;			diff[k] += score2-score1;			goals[k] +=score2;					}		if (team_game.equals(teams.get(k))){			diff[k] += score1-score2;		goals[k] +=score1;		}}				}	else if(score1>score2){		for(int k=0;k<n;k++) {		if (team_game.equals(teams.get(k))){			points[k] +=  3;			diff[k] += score1-score2;			goals[k] +=score1;		}		if (team_game2.equals(teams.get(k))){			diff[k] += score2-score1;			goals[k] +=score2;		}		}				}		else if(score1==score2){		for(int k=0;k<n;k++){		if (team_game2.equals(teams.get(k))){			points[k] +=  1;			goals[k] +=score2; 		}		if (team_game.equals(teams.get(k))){			points[k] +=  1;			goals[k] +=score1;		}		}		}	}	 Integer ind[] = new Integer[n];     for(int i = 0; i < n; ++i) ind[i] = i;     Arrays.sort(ind, (Integer p1, Integer p2) -> {         if(points[p2] != points[p1]) return points[p2] - points[p1];         if(diff[p2] != diff[p1]) return diff[p2] - diff[p1];         return goals[p2] - goals[p1];     });     String ans[] = new String[n/2];     for(int i = 0; i < n/2; ++i) ans[i] = teams.get(ind[i]);     Arrays.sort(ans);          for(String str : ans)     	 System.out.println(str);	}   }
