num = int(input())arr = sorted(map(int, input().split()))cases = int(input())while cases:    cases -= 1    n = int(input())    ans = -1    l, r = 0, num-1    found = False    while l <= r:        mid = (l+r)//2        if arr[mid] <= n:            ans = mid            l = mid+1        else:            r = mid-1     print(ans + 1)   
