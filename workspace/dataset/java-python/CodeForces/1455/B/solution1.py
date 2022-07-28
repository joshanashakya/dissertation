res = [] for _ in range(int(input())):    n = int(input())
if n < 0:
    res.append(-n)    else:
    s = 0
i = 0
while s < n:            i += 1
s += i
if s == n or s - n > 1:
    res.append(i)        else:
    res.append(i + 1) for i in res:    print(i)
