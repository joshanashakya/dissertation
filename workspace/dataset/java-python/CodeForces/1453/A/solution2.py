for i in range(int(input())):    input()
n, m, count = input().split(" "), input().split(" "), 0
if len(n) >= len(m):        for
i in m:
if i in n:
    count += 1    else:
    for
i in n:
if i in m:                count += 1
print(count)
