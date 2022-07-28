l, r = map(int, input().split())print('YES')for i in range(r-l+1):    if i%2 == 0:        print(l+i, l+i+1)
