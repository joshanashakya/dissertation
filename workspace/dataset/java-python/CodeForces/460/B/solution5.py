a, b, c = map(int, input().split())ans = []for i in range(1, 82):    t = b * i**a + c    if t > 0 and t <= 10**9:        k = t        s = 0        while k:            s += k % 10            k //= 10        if s == i:            ans.append(t)print(len(ans))print(*ans)