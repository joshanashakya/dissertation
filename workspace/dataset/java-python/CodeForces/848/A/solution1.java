#include<cstdio>#include<cstring>#include<string>#include<algorithm>#include<cctype>using namespace std; template <typename T>inline void read(T&x){    x=0; char temp=getchar(); bool f=false;    while(!isdigit(temp)){if(temp=='-') f=true; temp=getchar();}    while(isdigit(temp)){x=(x<<1)+(x<<3)+temp-'0'; temp=getchar();}    if(f) x=-x;}template <typename T>void print(T x){    if(x<0) putchar('-'),x=-x;    if(x>9) print(x/10);    putchar(x%10+'0');} //basicint k; int main(){    read(k);    for(register int x=0;x<26;x++){        int now=0;        while(k-now>=0) putchar('a'+x),k-=now,now++;        if(k<=0) break;    }    return 0;}