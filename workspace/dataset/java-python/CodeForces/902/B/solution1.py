n=int(input())p=list(map(int,input().split()))c=list(map(int,input().split()))step=1for i in range(1,n):  if c[i]!=c[p[i-1]-1]:    step+=1print(step)
