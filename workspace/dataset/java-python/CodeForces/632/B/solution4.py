n = int(input())p = list(map(int, input().split()))s = input()total = 0for i in range(n):    if s[i] == 'B':        total += p[i]ans = totalcur = totalfor i in range(n):    if s[i] == 'A':        cur += p[i]    else:        cur -= p[i]    ans = max(ans, cur) cur = totalfor i in reversed(range(n)):    if s[i] == 'A':        cur += p[i]    else:        cur -= p[i]    ans = max(ans, cur) print(ans)
