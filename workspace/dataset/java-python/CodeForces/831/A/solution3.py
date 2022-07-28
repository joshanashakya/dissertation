n=int(input())a=list(map(int,input().strip().split()))i=0while i<n-1 and a[i]<a[i+1]:	i+=1while i<n-1 and a[i]==a[i+1]:	i+=1while i<n-1:	if a[i]<=a[i+1]:		print("NO")		exit(0)	i+=1print("YES")
