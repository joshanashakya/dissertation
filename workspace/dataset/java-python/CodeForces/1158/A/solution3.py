I=lambda:map(int,input().split())n,m=I()a,b=sorted(I(),reverse=1),sorted(I())s=sum(b)for i in range(1,n):s+=a[i]*mif a[0]>min(b):s=-1elif a[0]!=b[0]:s+=a[0]-a[1]print(s)
