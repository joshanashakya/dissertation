n = int(input())a = list(map(int,input().split()))c=0for i in range(1,n-1):    if(a[i]==0 and a[i-1]==1 and a[i+1]==1):        a[i+1]=0        c+=1print(c)
