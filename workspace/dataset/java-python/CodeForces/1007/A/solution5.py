import sysinput = sys.stdin.readline ''' ''' n = int(input())a = list(map(int, input().split()))a.sort(reverse=True)count = 0l, r = 0, 1 while l < n and r < n:    if a[l] > a[r]:        l += 1        r += 1        count += 1    else:        r += 1 print(count)
