#include <bits/stdc++.h>#define ll long long int#define vll vector<long long int>using namespace std;ll MOD = 1e9 + 7; void solver(){	ll n,n7=-1;	cin>>n;	for(ll i=0;i<=1e6;i++){		if((n-i*7)>=0&&(n-i*7)%4==0)n7=i;	}	if(n7==-1){cout<<-1<<"\n";return ;}	ll n4=(n-n7*7)/4;	for(ll i=0;i<n4;i++)cout<<4;	for(ll i=0;i<n7;i++)cout<<7;	cout<<"\n";} int main(){	ios_base::sync_with_stdio(NULL);	cin.tie(NULL);	ll t = 1;	//cin>>t;	while (t--){		solver();	}	return 0;}