a, b, d = map(int, input().split())arr = list(map(int, input().split())) ans = 0bin = 0for n in arr:    if n <= b:        bin += n        if bin > d:            ans += 1            bin = 0 print(ans)
