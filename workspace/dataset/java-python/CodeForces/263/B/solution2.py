n,k=map(int,input().split())arr=[int(i) for i in input().split()]arr.sort()if k>n:    print(-1)else:    print(arr[n-k],arr[n-k])
