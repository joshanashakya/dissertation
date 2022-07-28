n=int(input())x=list(map(int,input().split()))a,m=2,2if n<=1:    m=1for i in range(2,n):    if x[i]==x[i-1]+x[i-2]:        a+=1    else:        a=2    m=max(m,a)print(m)
