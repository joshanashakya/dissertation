t = int(input())
for i in range(t):    n = int(input())
a = list(map(int, input().split()))
sum = 0
c1 = 0
c2 = 0
for j in range(len(a)):        sum = sum + a[j]
if sum % 2 != 0:
    print('NO')    else:
    for
j in a:
if j == 1:
    c1 += 1            else:
    c2 += 1
if (sum % 4 == 0 or (sum % 4 == 2 and c1 != 0)):
    print('YES')        else:
    print('NO')
