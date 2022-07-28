a, b = map(int, input().split())arr = sorted(map(int, input().split()))ans = float("inf") for n in arr:    if b % n == 0:        if b//n < ans:            ans = b//n  print(ans)
