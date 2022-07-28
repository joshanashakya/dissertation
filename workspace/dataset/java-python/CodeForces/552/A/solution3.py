n = int(input())s=0for _ in range(n):    x1,y1,x2,y2 = map(int,input().split())    s=s+abs(x2-x1+1)*abs(y2-y1+1)print(s)    
