n=int(input())a=list(map(int,input().split())) t=0for i in range(n):    t+=a[i] t=t//ncnt=0 for i in range(n):    if a[i]>t:        a[i+1]+=abs(a[i]-t)        cnt+=(abs(a[i]-t))     elif a[i]<t:        a[i+1]-=abs(a[i]-t)        cnt+=(abs(a[i]-t)) print(cnt)