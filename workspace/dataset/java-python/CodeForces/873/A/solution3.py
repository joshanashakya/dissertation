n, k, x = map(int, input().split())arr = list(map(int, input().split())) ans = 0while k and arr and arr[-1] > x:    arr.pop()    ans += x    k -= 1 print(ans + sum(arr))
