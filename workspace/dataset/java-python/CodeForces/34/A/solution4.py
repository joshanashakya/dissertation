n=int(input())a=list(map(int, input().split()))m=abs(a[0]-a[n-1])l=[1,n]for i in range(n-1):    if abs(a[i]-a[i+1])<m:        m=abs(a[i]-a[i+1])        l.append(i)if len(l)==2:    print(*l)else:print(l[len(l)-1]+1,l[len(l)-1]+2)
