#include<bits/stdc++.h>using namespace std; typedef long long ll; void solve(){    ll x, y, p, q;    cin >> x >> y >> p >> q;    if((p == 0 && x != 0) || (p == q && x != y)){        cout << -1 << endl; return;    }    ll l = 1, r = 1e9, mid;    ll ans = 1e18;    while(l <= r){        mid = l + r >> 1;        ll _p = mid * p, _q = mid * q;        if(y > _q){            l = mid + 1; continue;        }        ll L = x, R = x + (_q - y);        if( L <= _p && _p <= R){            ans = min(ans, _q);            r = mid - 1;        }else{            l = mid + 1;        }    }    cout << ans - y << endl;}int main(){    // #define LOCAL#ifdef LOCAL    freopen("in.in", "r", stdin);    freopen("out.out", "w", stdout);#endif      int _ = 1;    cin >> _;    for(int i = 1; i <= _; ++i) solve();}
