r,g,b = map(int,input().split())ans = 0 z = min(r,g,b)ans+=zr-=zg-=zb-=zans+= r//3 + g//3 + b//3 if z>=1:    ans = max(z-1+(r+1)//3 + (b+1)//3 + (g+1)//3,ans)if z>=2:    ans = max(z-2+(r+2)//3 + (b+2)//3 + (g+2)//3,ans) print(ans)