for t in range(int(input())):    s, i, e = map(int, input().split())    low = 0    high = e#     Finding the minimum limit    low_pos = high_pos = e+1    while low<=high:        mid = low + (high-low)//2        if mid + s > i+(e-mid):            low_pos = mid            high = mid-1        else:            low = mid+1    print(high_pos-low_pos)
