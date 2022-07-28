t = int(input())
for _ in range(t):    n = int(input())
s = input()
i = 0
j = n - 1
while (i < j):        if
s[j] == 't': j -= 1
if s[i] == 't':            a = '' + s[i]
b = '' + s[j]
s = s[:i] + b + s[i + 1:]
s = s[:j] + a + s[j + 1:] else:            i += 1
print(s)
