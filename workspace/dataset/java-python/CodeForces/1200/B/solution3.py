test = int(input())for t in range(0 , test):    n, m, k = map(int, input().split())    arr = list(map(int, input().split()))    p = int(0)    for i in range (n-1):        m = m + arr[i] - max(p , arr[i + 1] - k)        if m < 0:            p = 1            break     if p == 0:        print("YES")    else:        print("NO")     
