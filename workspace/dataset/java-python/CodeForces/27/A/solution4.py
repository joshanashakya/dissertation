n = int(input())arr = list(map(int,input().split()))arr  =sorted(arr)for i in range(1,n+1):    if i!=arr[i-1]:        print(i)        breakelse:    print(n+1)
