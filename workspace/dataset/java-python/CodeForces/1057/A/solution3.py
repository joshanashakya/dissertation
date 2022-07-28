n=int(input())p=[0,0,*map(int,input().split())]r=[]while n:r.append(n);n=p[n]print(*reversed(r))
