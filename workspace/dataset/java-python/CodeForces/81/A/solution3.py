s = input() i = 0
t = []
while i < len(s):    j = i
while j + 1 < len(s) and s[j + 1] == s[i]:        j += 1
if (j - i + 1) % 2 == 1:        if
t and t[-1] == s[i]: t.pop() else:            t.append(s[i])
i = j + 1 print(''.join(t))
