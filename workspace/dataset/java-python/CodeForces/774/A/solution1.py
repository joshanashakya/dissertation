#include <bits/stdc++.h> #define int long long #define vec vector#define fi first#define se second#define pb push_back#define all(x) x.begin(), x.end()#define rall(x) x.rbegin(), x.rend()#define fast_io ios_base::sync_with_stdio(0), cin.tie(0), cout.tie(0)#define sz(x) (long long)(x).size()#define sq(x) (x)*(x)using namespace std;typedef pair<long long, long long> PII;typedef long double ld; int c1, c2, n;int f(int x){	int ans = c1*x;                   	vec < int > kv;	int kol = n-x;                     	for(int i = 0; i < x; ++i) kv.pb((kol)/x);	kol %= x;	int in = 0;	while(kol) kv[in]++, kol--, in++;	for(int i = 0; i < kv.size(); ++i) ans += c2*sq(kv[i]);		return ans;}int trix(int l, int r){//	cout << l << " " << r << "\n";	if(l == r) return l;	int t1 = (l+r)/2;	int t2 = t1+1;	int m1 = f(t1);	int m2 = f(t2);	if(m1 > m2) l = t2;	else r = t1;	return trix(l, r);}signed main(){	#ifdef LOCAL	ifstream cin("input.txt");//	ofstream cout("output.txt");		#endif               	cin >> n >> c1 >> c2;	string s;	cin >> s;	int kol1 = 0;	for(auto &i: s) if(i-'0' == 1) kol1++;//	cout << "\t\tDEBUG\n";//	for(int i = 1; i <= kol1; ++i)//		cout << f(i) << "\n";//	cout << "--------------------------------------------\n";	cout << f(trix(1, kol1));	return 0;}          