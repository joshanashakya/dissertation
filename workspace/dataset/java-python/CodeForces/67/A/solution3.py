from collections import deque n = int(input())
s = input()
ans = [1] * n for i in range(1, n):    if
s[i - 1] == 'R': ans[i] = ans[i - 1] + 1 elif s[i - 1] == '=': ans[i] = ans[i - 1] for i in range(n - 2, -1, -1):    if
s[i] == 'L': ans[i] = max(ans[i + 1] + 1, ans[i]) elif s[i] == '=': ans[i] = max(ans[i], ans[i + 1])  print(*ans)
