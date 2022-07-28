n = int(input())s = input().split()ans = 0for i in s:    now = 0    for j in i:        now += j <= 'Z'    ans = max(ans, now) print(ans)
