#include <iostream>#include <algorithm>#include <string.h>#include <stdio.h>#include <math.h>#include <set>#include <map>#include <list>#include <vector>using namespace std;typedef long long LL;const int maxn = 1e5 + 3;int main(){    ios_base::sync_with_stdio(0), cin.tie(0);     int test;    cin >> test;    while (test--)    {        int n;        cin >> n;         int x = 0;        vector<int> a(n);        for (auto& i : a)        {            cin >> i;            x ^= i;        }         if (x == 0)        {            cout << "DRAW\n";            continue;        }         for (int k = 30; k >= 0; --k)            if (x >> k & 1)// '&' 位运算‘与’ 当式子左右两段均为1 时为一            {                vector<int> f(2);                for (auto& i : a) ++f[i >> k & 1];                if (f[1] % 4 == 3 && f[0] % 2 == 0)                    cout << "LOSE\n";                else                    cout << "WIN\n";                break;            }    }     return 0;}	 	 	 					    	 	 	    	 	 		