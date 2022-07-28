t = int(input())
for ti in range(t):    n = int(input())
str = input()
i = n - 1
c = 0
while i >= 0 and str[i] == ')':        i -= 1
c += 1
if c > n - c:
    print('Yes')    else:
    print('No')
