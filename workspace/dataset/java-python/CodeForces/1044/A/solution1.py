#include <bits/stdc++.h>using namespace std;int n,m; vector < int > verticle ;vector < int > row; int main(){ cin>>n>>m;   int num1,num2,num3;  for(int i=0;i<n;++i) {     cin>>num1;      if(num1!=1000000000)     verticle.push_back(num1); }  verticle.push_back(1000000000);  for(int j=0;j<m;++j)    {        cin>>num1>>num2>>num3;         if(num1==1)            row.push_back(num2);    }    sort(row.begin(),row.end());  sort(verticle.begin(),verticle.end());   int ans = INT_MAX;   int j = 0;  int len = row.size();   for(int i=0;i<verticle.size();++i)  {      //find the correcponding row      // cout<<i<<"  wrorkon "<<endl;       while(j<row.size()&&row[j]<verticle[i])        ++j;       ans = min(ans,i+len-j);    // cout<<" WE ARE AT "<<dist<<" ans is "<<ans<<endl;   }   cout<<ans<<endl;          }