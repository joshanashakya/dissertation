n=int(input())a=sorted(list(map(int,input().split())))for i in range(n-1):    if a[i]<a[i+1] and a[i]*2>a[i+1]:        print("YES")        exit()print("NO")
