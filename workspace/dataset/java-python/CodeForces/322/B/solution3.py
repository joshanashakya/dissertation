a, b, c = map(int, input().split())ans = 0for i in range(3):    k = min(i, a, b, c)    x, y, z = a-k, b-k, c-k    ans = max(ans, (x//3)+(y//3)+(z//3) + k) print(ans)
