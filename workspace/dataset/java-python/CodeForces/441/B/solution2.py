n, v = map(int, input().split())lst = [0] * 3002for i in range(n):    a, b = map(int, input().split())    lst[a] += b ans = 0prev = 0for i in range(1, len(lst)):    available = min(v, prev + lst[i])    ans += available    if prev >= v:        prev = lst[i]    else:        prev = max(0, lst[i] - (v - prev)) print(ans)