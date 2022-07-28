/******************************************************************************                               Online C++ Compiler.               Code, Compile, Run and Debug C++ program online.Write your code in this editor and press "Run" button to compile and execute it. *******************************************************************************/ #include <iostream>#include <cmath>#include <vector>#include <algorithm>using namespace std; long double getDist(long long x1, long long y1, long long x2, long long y2){    return sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));} int main(){    long long n, ax, ay, bx, by, cx, cy;    cin>>ax>>ay>>bx>>by>>cx>>cy;    cin>>n;    vector<long long> x(n), y(n);    for(int i = 0 ; i < n; i++)      cin>>x[i]>>y[i];           long double sum = 0, ans = 1e18;     long double sa = 0, sb = 0;     for(int i = 0 ; i < n; i++)     {         long double da = getDist(ax, ay, x[i], y[i]);         long double db = getDist(bx, by, x[i], y[i]);         long double dc = getDist(cx, cy, x[i], y[i]);         sum += 2*dc;         da -= dc;         db -= dc;        ans = min(ans,sb+da);		ans = min(ans,sa+db);		sa = min(sa,da);		sb = min(sb,db);     }   cout.precision(12);    cout<<(double) sum+ans<<endl;    return 0;}