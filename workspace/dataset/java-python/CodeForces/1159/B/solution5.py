n,a,k=int(input()),list(map(int,input().split())),10**9for i in range(n):    k=min(k,a[i]//(max(n-i-1,i)))print(k)
