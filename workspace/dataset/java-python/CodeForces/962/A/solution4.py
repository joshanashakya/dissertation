n=int(input())a=list(map(int,input().split()))b=sum(a)c=0for i in range(n):    c+=a[i]    if c>=b/2:        print(i+1)        break
