#include<bits/stdc++.h>using namespace std; #define fastio ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL);#define fr(i,k) for(i=0;i<k;i++)#define deb(x) cerr<<#x<<"  = "<<x<<endl;#define deb2(x,y) cerr<<#x<<" = "<<x<<"  "<<#y<<" = "<<y<<endl;#define print(x) for (auto k:x) cout<<k<<" ";cout<<endl;#define SZ(x) (x).size();#define ll long long#define mod 1000000007#define ff first#define ss second#define pb push_back#define em emplace_back#define ulli unsigned long long int#define inf 1e18#define endl "\n"typedef vector<vector<ll>> vvll;typedef vector<ll> vll;typedef vector<pair<ll, ll>> vpll;typedef pair<ll, ll> pll;typedef vector<bool> vb;void solve();void pre();  int main() {	fastio;#ifndef ONLINE_JUDGE	freopen("input.txt", "r", stdin);	freopen("output.txt", "w", stdout);#endif 	ll t;	t = 1; 	cin >> t;	for (ll test = 1; test <= t; test++)	{		//cout << "Case #" << test << ": ";		solve();	}	return 0;}  inline void solve(){	ll n, i, c, x, y, z;	cin >> n; 	c = n / 2; 	ll a[n]; 	for (i = 0; i < n; i++)		cin >> a[i];  	x = 1;	for (i = 1; i < n; i++)	{		if (a[i] != a[i - 1])			break; 		x++;	}  	i++;	y = 1;	for (; i < n; i++)	{		if (a[i] != a[i - 1] && y > x)			break; 		y++;	} 	ll r = -1;	z = 1;	i++;	for (; i < n; i++)	{		if (a[i] != a[i - 1])		{			if (z > x && x + y + z <= c)			{				r = z;			}		}		z++;	} 	if (r != -1)		cout << x << " " << y << " " << r << endl; 	else		cout << 0 << " " << 0 << " " << 0 << endl; }
