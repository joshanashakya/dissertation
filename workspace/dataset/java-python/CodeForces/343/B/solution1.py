#include<iostream>#include<stack>#include<string> using namespace std; int main(){    stack<char> wires;    string wireTangle;    getline(cin, wireTangle);    for(int i = 0; i < wireTangle.length(); i++){        if(!wires.empty() && wires.top() == wireTangle[i])            wires.pop();        else            wires.push(wireTangle[i]);    }    if(wires.empty())        cout<<"Yes";    else        cout<<"No";    return 0;}