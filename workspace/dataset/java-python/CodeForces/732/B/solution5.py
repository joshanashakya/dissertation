n,k=map(int,input().split())a=list(map(int,input().split()))count=sum(a)for i in range (n-1):    if(a[i]+a[i+1]<k):        add=k-a[i]        a[i+1]=addcount1=sum(a)print(count1-count)print(*a,sep=" ")
