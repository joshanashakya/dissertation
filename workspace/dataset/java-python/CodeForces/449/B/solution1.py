#include <bits/stdc++.h> #pragma GCC optimize("O3")#define int long long using namespace std; signed main(){	cin.tie(0);	ios::sync_with_stdio(0);	int n, m, k, s = 0;	cin >> n >> m >> k;	vector< vector< pair<int, int> > > g(n);	for(int i = 0, u, v, w; i < m; i++){		cin >> u >> v >> w;		u--, v--;		g[u].push_back({v, w}), g[v].push_back({u, w});	}	vector<int> dis(n, numeric_limits<int>::max()), vis(n);	priority_queue< pair<int, int>, vector< pair<int, int> >, greater< pair<int, int> > > q;	while(k--){		int a, b;		cin >> a >> b;		a--;		q.push({b, a+n});		dis[a] = min(dis[a], b);	}	dis[0] = 0, q.push({0, 0});	while(!q.empty()){		int u = q.top().second, v, w;		q.pop();		if(u > n){			u -= n;			if(vis[u]) s++;		}		if(vis[u]) continue;		vis[u] = 1;		for(auto t : g[u]){			tie(v, w) = t;			if(dis[v] >= dis[u]+w) dis[v] = dis[u]+w, q.push({dis[v], v});		}	}	cout << s << "\n";}