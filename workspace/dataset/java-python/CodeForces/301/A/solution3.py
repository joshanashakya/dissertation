/*Author--Vishwas Agrawal*//*Author--Vishwas Agrawal*/#pragma GCC target("avx2")#pragma GCC optimization("O3")#pragma GCC optimization("unroll-loops")#pragma GCC optimize("Ofast")#pragma GCC target("avx,avx2,fma")#include <bits/stdc++.h>using namespace std;typedef long long int ll;#define vll vector<ll>#define pll pair<ll, ll>#define vpll vector<pair<ll, ll>>#define fi first#define se second#define pb push_back#define mp make_pair#define test  \    ll t;     \    cin >> t; \    while (t--)#define fio                           \    ios_base::sync_with_stdio(false); \    cin.tie(NULL);                    \    cout.tie(NULL);#define M 1000000007LL#define input(v, n) \    inc(i, 0, n)    \    {               \        ll x;       \        cin >> x;   \        v.pb(x);    \    }#define print(v, n) \    inc(i, 0, n) { cout << v[i] << " "; }#define all(x) x.begin(), x.end()#define sortall(x) sort(all(x))#define endl "\n"#define inc(i, a, n) for (ll i = a; i < n; i++)#define dec(i, a, n) for (ll i = n - 1; i >= a; i--)#define maxheap priority_queue<ll>#define minheap priority_queue<ll, vector<ll>, greater<ll>>long long binpow(long long base, long long exp, int mod){    long long res = 1;    while (exp > 0)    {        if (exp % 2 == 1)            res = (res * base) % mod;        exp = exp >> 1;        base = (base * base) % mod;    }    return res;}long long mod(long long x){    return ((x % M + M) % M);} long long add(long long a, long long b){    return mod(mod(a) + mod(b));} long long mul(long long a, long long b){    return mod(mod(a) * mod(b));} int main(){    fio;    ll n;    cin >> n;    vll v;    input(v, 2 * n - 1);    ll sum = 0;    vll neg, v2;    for (int i = 0; i < 2 * n - 1; i++)    {        v2.pb(abs(v[i]));        sum += abs(v[i]);        if (v[i] < 0)        {            neg.pb(abs(v[i]));        }    }    sortall(v2);    if (n % 2)        cout << sum << endl;    else    {        if (neg.size() % 2 == 0)        {            cout << sum << endl;        }        else        {            cout << sum - 2 * v2[0] << endl;        }    }     return 0;}