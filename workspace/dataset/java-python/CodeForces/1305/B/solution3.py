s = input()ud = [] r = len(s) - 1 for l in range(len(s)):    if l == r:        break    if s[l] == '(':        while s[r] == '(' and r > l:            r -= 1        if s[r] == ')':            ud.append(l + 1)            ud.append(r + 1)            r -= 1 if len(ud) == 0:    print(0)else:    print(1)    print(len(ud))    print(' '.join(map(str, sorted(ud))))
