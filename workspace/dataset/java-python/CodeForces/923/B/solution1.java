#include<iostream>#include<vector>#include<algorithm>using namespace std;    int main(){    int N;    cin >> N;    vector<long long> V(200000, 0);    vector<long long> T(200000, 0);    vector<long long> count(200000, 0);    vector<long long> M(200000, 0);    for(int i = 1; i <= N; ++i) cin >> V[i];    for(int i = 1; i <= N; ++i)    {        cin >> T[i];        T[i] += T[i - 1];    }    long long ost = 0;    for(int i = 1; i <= N; ++i)    {        long long j = lower_bound(T.begin() + i, T.begin() + N + 1, T[i - 1] + V[i]) - T.begin();        count[j]++;        M[j] += V[i] - T[j - 1] + T[i - 1];        ost += count[i];        cout << (T[i] - T[i - 1]) * (i - ost )  + M[i] << ' ';    } }