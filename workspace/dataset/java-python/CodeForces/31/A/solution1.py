n = int(input())arr = list(map(int,input().split()))flag = 0for i in range(n):    for j in range(n):        if(i==j):            continue        for k in range(n):            if(i==k or j==k):                continue            if(arr[i]==arr[j]+arr[k]):                flag = 1                print(i+1,j+1,k+1)                break        if(flag):            break    if(flag):        breakif(flag == 0):    print(-1)
