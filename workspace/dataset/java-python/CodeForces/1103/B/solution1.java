#include <bits/stdc++.h>using namespace std;#define int long long int32_t main() {    ios::sync_with_stdio(false);    cin.tie(nullptr);    cout.tie(nullptr);    string s;    int x = 536870918;    while (cin >> s && s[0] != 'e') {        int step = 2;        int l, r;        int cnt = 0;        char spj1, spj2;        cout << "? 1 2" << endl;        cnt++;        //spj1 = 'y';        cin >> spj1;        if (spj1 == 'x') {            cout << "? 2 3" << endl;            cnt++;            cin >> spj2;            if (spj2 == 'x') {                cout << "! 1" << endl;                continue;            } else {                cout << "! 2" << endl;                continue;            }        } else {            while (1) {                cout << "? " << step << ' ' << step + step << endl;                cnt++;                char res;                cin >> res;                //res = (step % x >= (2LL * step % x) ? 'x' : 'y');                if (res == 'x') {                    l = step, r = step + step;                    break;                }                step <<= 1;            }            while (r - l > 1) {                int mid = (l + r) >> 1;                char rl;                cout << "? " << l << ' ' << mid << endl;                cnt++;                cin >> rl;                //rl = (l % x >= mid % x ? 'x' : 'y');                if (rl == 'x') {                    r = mid;                } else {                    l = mid;                }            }            if (l == r) {                cout << "! " << l << endl;                //cout << cnt << endl;                continue;            }            cout << "? " << l << ' ' << r << endl;                        char res;            //res = (l % x >= r % x ? 'x' : 'y');            //cout << cnt << endl;            cin >> res;            if (res == 'x') {                cout << "! " << r << endl;            } else {                cout << "! " << r + 1 << endl;            }        }    }    return 0;}
