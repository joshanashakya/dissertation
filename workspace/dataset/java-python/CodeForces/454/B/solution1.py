n = int(input())arr = list(map(int,input().split()))if(arr == sorted(arr)):    print(0)else:    f = 0     for i in range(n-1):        if(arr[i]>arr[i+1]):            f = i            break    k = arr[f+1:]    p = k + arr[:f+1]    if(p == sorted(arr)):        print(len(k))    else:        print(-1)
