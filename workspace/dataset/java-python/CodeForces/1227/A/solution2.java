#include<bits/stdc++.h>using namespace std;void solve(){	int n;	cin>>n;	int mnX=1e9,mxY=-1;	for(int i=0;i<n;i++){		int x,y; cin>>x>>y;		mnX=min(mnX,y),		mxY=max(mxY,x);	}cout<<max(0,mxY-mnX);}int main(){	int t;	cin>>t;	while(t--)	{		solve(),cout<<endl;	}	return 0;}