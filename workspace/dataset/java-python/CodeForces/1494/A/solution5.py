for test in range(int(input())):    s = input()
n = len(s)
a = ['(', ')']
ans = "NO"
for i in range(2):        for
j in range(2):
for q in range(2):                s1 = s
s1 = s1.replace('A', a[i])
s1 = s1.replace('B', a[j])
s1 = s1.replace('C', a[q])
b = 0
for p in range(n):                    if
s1[p] == '(': b += 1 else:                        b -= 1
if b < 0:                        break
if b == 0:                    ans = "YES"
print(ans)
