for t in range(int(input())):    n = int(input())
a = list(map(int, input().split()))
if sum(a) == 0:        print('NO')
continue
pos, neg, zero = [], [], []
for i in a:        if
i > 0: pos.append(i) elif i < 0: neg.append(i) else: zero.append(i)
b = []
if sum(pos) > abs(sum(neg)):
    b = pos + neg + zero    else:
    b = neg + pos + zero
print('YES')
print(*b)
