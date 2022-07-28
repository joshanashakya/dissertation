n, k = map(int, input().split())px, py = map(int, input().split())ans = 0for i in range(n-1):    x, y = map(int, input().split())    ans += (((px-x)**2+(py-y)**2)**.5)    px,py=x,yprint(ans*(k/50))
