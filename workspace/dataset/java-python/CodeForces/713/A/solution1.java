 #include<iostream>#include<stdio.h>#include<cstdio>#include<bits/stdc++.h>#include<limits>#include<algorithm>#include <set>#define pb push_back#define all(v) (v).begin(),(v).end()#define deb(x) cout<<x<<"\n";#define loop(n) for(int i=0; i<n; i++)#define ld long double#define ll long long#define pii pair<int,int>#define ff first#define ss second#define ump unordered_map#define mod 1000000007#define pr(n) cout<<n<<endl;#define inf INT_MAX#define FAST ios_base::sync_with_stdio(false); cin.tie(NULL);using namespace std;  int main(){     FAST    int t=1;   cin>>t;    unordered_map<int,int>m;    while(t--)    {     char op;     string s;       cin>>op>>s;     int a=0;      for (int i=s.length()-1; i>=0; i--)     {         int x=(s[i]-'0')%2;          a+=pow(2,s.length()-1-i)*x;     }         if(op=='+')     m[a]++;     else if (op=='-') m[a]--;     else{         pr(m[a]);     }             }  }         
