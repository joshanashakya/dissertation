#include <bits/stdc++.h> using namespace std; int main(){    ios_base::sync_with_stdio(0);    cin.tie();    cout.tie();     long long n,m;    cin>>n>>m;    vector <long long> v(n);    for(long long i=0;i<n;i++)        cin>>v[i];    vector < pair < pair <long long,long long>,long long> > e(m);    for(long long i=0;i<m;i++){        long long a,b,c;        cin>>a>>b>>c;        a--,b--;        e[i]={{a,b},c};    }    long long resn=0,resd=1;    for(long long i=0;i<m;i++){        long long n=v[e[i].first.first]+v[e[i].first.second],d=e[i].second;        if(resn*d<n*resd){            resn=n;            resd=d;        }    }    cout.precision(12);    cout<<fixed<<1.0*resn/resd<<'\n';     return 0;}
