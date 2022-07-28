Into = list(input())
big = 0
small = 0
out = []
for i in Into:    if
ord(i) < 97: big += 1 else:        small += 1
if big > small:    for
j in Into:
if ord(j) >= 97:            j = chr(ord(j) - 32)
out.append(j) else:            out.append(j) else:    for j in Into:        if
ord(j) < 97: j = chr(ord(j) + 32)
out.append(j) else:            out.append(j)
s = ''
for k in out:    s += kprint(s)
