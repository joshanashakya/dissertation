#include<iostream>#include<cstdio>#include<cstring>#include<cstdlib>#include<cmath>#include<algorithm>#include<queue>#include<vector>#include<stack>#include<map>#include<set>#include<ctime>#define ll long longusing namespace std;const int maxx=600010;ll t,n,m;ll ans=0,sum=0,cnt=0,res=0,total=0,l=0,r=0;ll a[maxx],h[maxx],bj[maxx];ll c[1111][1111],a1[1111][1111],a2[1111][1111],a3[1111][1111],a4[1111][1111];int main(){	scanf("%lld%lld",&n,&m);	for(register int i=1;i<=n;i++)		for(register int j=1;j<=m;j++)			scanf("%lld",&c[i][j]);	for(register int i=1;i<=n;i++)	{		for(register int j=1;j<=m;j++)bj[j]=c[i][j];		sort(bj+1,bj+m+1);		cnt=0;		for(register int j=1;j<=m;j++)if(bj[j]!=bj[j-1])bj[++cnt]=bj[j];		for(register int j=1;j<=m;j++)		{			a2[i][j]=lower_bound(bj+1,bj+cnt+1,c[i][j])-bj-1;			a1[i][j]=cnt-a2[i][j];		}	}	for(register int j=1;j<=m;j++)	{		for(register int i=1;i<=n;i++)bj[i]=c[i][j];		sort(bj+1,bj+n+1);			cnt=0;		for(register int i=1;i<=n;i++)if(bj[i]!=bj[i-1])bj[++cnt]=bj[i];		for(register int i=1;i<=n;i++)		{			a4[i][j]=lower_bound(bj+1,bj+cnt+1,c[i][j])-bj-1;			a3[i][j]=cnt-a4[i][j];		}	}		for(register int i=1;i<=n;i++)	{		for(register int j=1;j<=m;j++)		{			ans=max(a2[i][j],a4[i][j])+max(a3[i][j],a1[i][j]);			printf("%lld ",ans);		}		printf("\n");	}	return 0;}
