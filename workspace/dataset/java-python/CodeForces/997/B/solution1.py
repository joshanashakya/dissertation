# include <bits/stdc++.h>using namespace std;# define int long long int n;int solve(int x) {	map <int, bool> ojbk;	int num = 0;	for (int i = 0; i <= x; i++) {		for (int j = 0; j <= x - i; j++) {			for (int k = 0; k <= x - i - j; k++) {				int qwq = i + j * 5 + k * 10 + (x - i - j - k) * 50;				if (!ojbk[qwq]) ojbk[qwq] = 1, num++;			}		}	}	return num;}signed main() {	scanf("%lld", &n);	if (n <= 25) printf("%lld\n", solve(n));	else printf("%lld\n", solve(25) + 49 * (n-25));	return 0;} 