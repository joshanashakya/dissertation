def evenArray(arr, n):    evenIdxOddCount = 0    oddIdxEvenCount = 0    for i in range(0,n):        if i % 2 == 0:            if arr[i] & 1:               evenIdxOddCount += 1        else:            if not(arr[i] & 1):                oddIdxEvenCount += 1    if evenIdxOddCount == oddIdxEvenCount:        print(evenIdxOddCount)    else:        print(-1)    returntc = int(input())for _ in range(0,tc):    n = int(input())    arr = [int(i) for i in input().split()][:n]     evenArray(arr, n)