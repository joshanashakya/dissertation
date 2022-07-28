t = int(input())
for _ in range(t):
    n, m = map(int, input().split())
    table = [input() for i in range(n)]
    ans = 0
    for x in range(n):
        for y in range(m):
            if table[x][y] == "D" and x + 1 == n:
                ans += 1
            elif table[x][y] == "R" and y + 1 == m:
                ans += 1
    print(ans)
