t = input()c = 0n = len(t)s = ''a = ':('for i in range(n):    if i - c == n - i:        if s == t[i:]:            a = t[:i]            break    if t[i] == 'a':        c += 1    if t[i] != 'a':        s += t[i]if c == n:    print(t)else:    print(a)
