a,b = map(int,input().split())ans = 0if(a > b):    ans += int(a//b)    a = a%bwhile(b!=0):    ans += int(a//b)    a,b = b,a%bprint(ans)
