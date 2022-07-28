t = int(input()) for _ in range(t):    s, i, e = map(int, input().split())    minAddStr = max(0, (e + i - s + 2) // 2)     print(max(e - minAddStr + 1, 0))
