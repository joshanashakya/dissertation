#define _USE_MATH_DEFINES#define _CRT_SECURE_NO_WARNINGS#include <iostream>#include <vector>#include <algorithm>#include <stack>#include <map>#include <functional>#include <cstring>#include <queue>#include <cmath>#include <deque>#include <list>#include <iomanip>#include <fstream>#include <string>#include <iterator>#include <set>#include <bitset>using namespace std; typedef long long LL;typedef long double LD;typedef vector<int> VI;typedef vector<LL> VLL;typedef vector<char> VCH;typedef vector<VI> VVI;typedef vector<VLL> VVLL;typedef vector<VCH> VVCH;typedef pair<int, int> PII;typedef pair<LL, LL> PLL;typedef pair<LD, LD> PDD;typedef vector<PII> VPII;typedef vector<PLL> VPLL; #define SZ(A) (int)(A.size())#define ALL(a) a.begin(), a.end()#define FOR(i, a, b) for(int i = (a); i < (b); ++i)#define RFOR(i, b, a) for(int i = (b) - 1; i >= a; --i)#define REP(i, N) FOR(i, 0, N)#define MP make_pair#define X first#define Y second const LL MAXN = 100007;const LL mod = 1000000007;const LL INF = 1e9;const LL LINF = 1e18;const double PI = acos(-1.0); int A[MAXN], B[MAXN];stack <PII> S; int main(){	ios_base::sync_with_stdio(0);	//freopen("In.txt", "r", stdin);	//freopen("dreamrun.in", "r", stdin);	//freopen("dreamrun.out", "w", stdout);	int n, k, m, t1 = 0, t2 = 0, n1;	cin >> n >> k >> m;	REP(i, n){		cin >> A[i];		if (!S.empty() && S.top().first == A[i])			S.push(MP(A[i], S.top().second + 1));		else S.push(MP(A[i], 1));		if (S.top().second == k){			REP(j, k) S.pop();			++t1;		}	}	if (m == 1){		cout << n - t1 * k;		return 0;	}	n1 = SZ(S);	REP(i, n1){		A[n1 - i - 1] = S.top().first;		S.pop();	}	REP(i, n1) A[n1 + i] = A[i];	int l = n1, r = -1;	REP(i, n1 << 1){		if (!S.empty() && S.top().first == A[i])			S.push(MP(A[i], S.top().second + 1));		else S.push(MP(A[i], 1));		if (S.top().second == k){			if (i < SZ(S) - k + n1)			{				REP(j, k) S.pop();				l = i + 1 - (++t2)*k;				r = i - n1;			}			else break;		}	}	bool c = true;	FOR(i, r + 1, l)		if (A[i] != A[r + 1]) c = false;	LL ans = 1LL * m * n1 - 1LL * (m - 1) * t2 * k;	if (c)	{		ans -= 1LL * m * (n1 - t2 * k) / k * k;		if ((1LL * m * n1) % k == 0)		{			n = r + n1 - l + 1;			REP(i, r + 1) B[i] = A[i];			FOR(i, l, n1) B[i + r - l + 1] = A[i];			while (!S.empty()) S.pop();			REP(i, n){				if (!S.empty() && S.top().first == B[i])					S.push(MP(B[i], S.top().second + 1));				else S.push(MP(B[i], 1));				if (S.top().second == k){					REP(j, k) S.pop();					ans -= k;				}			}		}	}	cout << ans;	return 0;}