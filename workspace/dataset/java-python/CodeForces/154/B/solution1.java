#include <bits/stdc++.h>using namespace std;int primes[100005];int s[100005];bool is[100005];void sieve(){	for(int i=2;i<=100000;i++){		if(s[i]==0){			s[i]=i;			for(int j=i+i;j<=100000;j+=i){				if(s[j]==0)s[j]=i;			}		}	}	return;}int main(){	sieve();	int n,m;cin>>n>>m;	while(m--){		char f;cin>>f;		if(f=='+'){			int a;cin>>a;			if(is[a]){				cout<<"Already on\n";			}else{				vector<int>pf;				int tmp=a;				bool t=false;				while(tmp!=1){					if(primes[s[tmp]]){						cout<<"Conflict with "<<primes[s[tmp]]<<'\n';						t=true;break;					}else{						pf.push_back(s[tmp]);						tmp/=s[tmp];					}				}				if(t)continue;				for(auto u:pf){					primes[u]=a;				}				is[a]=true;				cout<<"Success\n";			}		}else{			int a;cin>>a;			if(is[a]==false){				cout<<"Already off\n";			}else{				int tmp=a;				while(tmp!=1){					primes[s[tmp]]=0;					tmp/=s[tmp];				}				is[a]=false;				cout<<"Success\n";			}		}	}	return 0;}