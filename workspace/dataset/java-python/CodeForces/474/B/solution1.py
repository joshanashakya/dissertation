def search(a, x):    l, r = 0, len(a) - 1    while l <= r:        mid = (l + r) // 2        if a[mid] >= x and a[mid - 1] < x:            return mid        elif a[mid] < x:            l = mid + 1        else:            r = mid - 1    return 0 n = int(input())a = list(map(int, input().split()))for i in range(1, n):    a[i] += a[i - 1] q = int(input())qu = list(map(int, input().split()))for x in qu:    print(search(a, x) + 1) 
