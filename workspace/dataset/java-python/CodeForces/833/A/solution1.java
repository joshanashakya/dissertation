#include<iostream>#include<vector>#include<queue>#include<cstring>#include<cmath>#include<map>#include<set>#include<cstdio>#include<algorithm>#define debug(a) cout<<#a<<"="<<a<<endl;using namespace std;const int maxn=1e5;typedef long long LL;inline LL read(){LL x=0,f=1;char ch=getchar();	while (!isdigit(ch)){if (ch=='-') f=-1;ch=getchar();}while (isdigit(ch)){x=x*10+ch-48;ch=getchar();}return x*f;}int main(void){  cin.tie(0);std::ios::sync_with_stdio(false);  LL t;cin>>t;  while(t--){    LL a,b;cin>>a>>b;    LL mul=a*b;    LL m=pow(mul,1.0/3)+0.5;    if(m*m*m==a*b&&a%m==0&&b%m==0){        cout<<"Yes"<<"\n";    }    else cout<<"No"<<"\n";  }return 0;}