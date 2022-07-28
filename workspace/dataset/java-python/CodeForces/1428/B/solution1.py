t = int(input())
while t > 0:    n = int(input())
s = str(input())
flag1 = 1
for i in range(len(s)):        if
s[i] == '<': flag1 = 0
break
flag2 = 1
for i in range(len(s)):        if
s[i] == '>': flag2 = 0
break
if flag1 == 1 or flag2 == 1:
    ans = n    else:
    ans = 0
s = s + s[0]
for i in range(0, n, +1):            if
s[i] == '-' or s[i + 1] == '-': ans = ans + 1
print(ans)       t = t - 1
