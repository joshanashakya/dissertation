# 447 or 477 start with odd  n, k = map(int, input().split())s = input()s = list(s) for i in range(n - 1):    if not k:        break    if s[i] != '4':        continue    tt = ''.join(s[i:i + 3])    if tt in ('447', '477') and i % 2 == 0:        if k % 2 == 1 and tt == '447':            s[i + 1] = '7'        if k % 2 == 1 and tt == '477':            s[i + 1] = '4'        break    if s[i] == '4' and s[i + 1] == '7':        if i % 2 == 0:            s[i + 1] = '4'        else:            s[i] = '7'        k -= 1 print(''.join(s))
