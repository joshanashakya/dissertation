#include <iostream> using namespace std; long long a,i,n;int main(){    cin >> a;     for(int i = 0; i < a; ++i){     cin >> n;        if(n == 2){            cout << 2;        }        else if(n % 2 )            cout << 1;        else            cout << 0;        cout << endl;    }    return 0;}
