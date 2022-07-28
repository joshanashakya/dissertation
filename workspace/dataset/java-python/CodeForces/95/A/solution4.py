n = int(input())
s = []
for _ in range(n):
    s.append(input())
w = input()
l = input()
x = []
ans = w
for i in range(n):
    ts = w
    li = len(s[i])
    for j in range(len(w) - li + 1):
        if ts[j:j + li].lower() == s[i].lower():
            p = ''
            for e in range(j, j + li):
                if w[e].islower():
                    if w[e] == l.lower():
                        if l.lower() == 'a':
                            p = p + 'b'
                        else:
                            p = p + 'a'
                    else:
                        p = p + l.lower()
                else:
                    if w[e] == l.upper():
                        if l.upper() == 'A':
                            p = p + 'B'
                        else:
                            p = p + 'A'
                    else:
                        p = p + l.upper()
            ans = ans[:j] + p + ans[j + li:]
print(ans)
