a,b=map(int,input().split())c,d=map(int,input().split())for i in range(10**5+1):  x=b+(a*i)  if x>=d and (x-d)%c==0:print(x);exit()print(-1)
