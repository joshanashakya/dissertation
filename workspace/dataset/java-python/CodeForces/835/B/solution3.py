k = int(input())digits = [ int(i) for i in input()]digits.sort()cur = sum(digits)ans = 0for d in digits:    if cur < k:        cur += 9 - d        ans += 1print(ans)
