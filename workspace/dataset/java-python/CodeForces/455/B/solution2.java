    /*package whatever //do not write package name here */        import java.io.*;    import java.util.*;            public class Solution {        public static Node root;       public static void main(String[] args) throws Exception{           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));           PrintWriter out = new PrintWriter(System.out);              StringTokenizer st = new StringTokenizer(br.readLine()) ;                            int n = Integer.parseInt(st.nextToken());              int k = Integer.parseInt(st.nextToken());                             Trie tn = new Trie();              root = tn.root;              for(int i=0;i<n;i++) tn.insert(br.readLine());              boolean[] winner = DFS(tn,tn.root);              if( !winner[0] || (k%2 == 0 && !winner[1])) out.println("Second");              else out.println("First");                        out.close();       }              public static boolean[] DFS(Trie tn, Node cur){           boolean[] winner = new boolean[2];          boolean leaf = true;                     for(int i=0;i<26;i++){               if(cur.children[i] != null){                   leaf = false;                   boolean[] win = DFS(tn,cur.children[i]);                   winner[0]|=!win[0];                   winner[1]|=!win[1];               }           }           return (leaf) ? new boolean[]{false,true} : winner;       }            }            class Node{        Node[] children;         public Node(){            children = new Node[26];        }    }            class Trie{       Node root = new Node();                    public void insert(String s){          Node cur =root;          for(int i=0; i<s.length(); i++){            if(cur.children[s.charAt(i) - 'a'] == null)               cur.children[s.charAt(i) - 'a'] = new Node();               cur = cur.children[s.charAt(i) - 'a'];            }        }    }