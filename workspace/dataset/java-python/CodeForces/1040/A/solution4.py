n, a, b = list(map(int, input().split()))s = list(map(int, input().split()))c = 0possible = Trueif s.count(2) == 0:    if s == s[::-1]:        c = 0    else:        possible = Falseelse:    if s == s[::-1]:        c = min(a, b)*(s.count(2))    else:        for i in range(0, n//2):            if s[i] == s[(i*(-1))-1]:                if s[i] == 2:                    c += min(a, b)*2                continue            else:                if s[i] != 2 and s[(i*(-1))-1] != 2:                    possible = False                    break                else:                    if s[i] == 0 or s[(i*(-1))-1] == 0:                        c += a                    else:                        c += b        if n % 2 != 0 and s[n//2] == 2:            c += min(a, b)print(c if possible else -1)
