#include <bits/stdc++.h>#define ll long longusing namespace std;ll INF = 1e9+7;int main(){  int n;  cin>>n;  int a[n],b[n],c[n+1];  for(int i=0;i<n;i++)cin>>a[i];  for(int i=0;i<n;i++){    cin>>b[i];    c[b[i]]=i;  }  for(int i=0;i<n;i++){    a[i]=c[a[i]];  }  int i=0;  for(i=1;i<n;i++){    if(a[i-1]>a[i])break;  }  cout<<n-i<<endl; }
