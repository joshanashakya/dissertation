n = int(input())
s = input() ans = [0 for i in range(n)] for i in range(n):    min_val = 1
if i > 0:        if
s[i - 1] == '=': ans[i] = ans[i - 1]
continue
if s[i - 1] == 'R':            min_val = ans[i - 1] + 1
cnt_low = 0
for j in range(i, n - 1):        if
s[j] == '=':
continue
if s[j] == 'L':            cnt_low += 1
if s[j] == 'R':            break
min_val = max(min_val, cnt_low + 1)
ans[i] = min_val print(*ans)
