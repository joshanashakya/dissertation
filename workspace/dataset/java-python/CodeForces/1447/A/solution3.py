m = int(input())
n = []
for i in range(m):    n.append(int(input()))
for i in n:    print(i - 1)
for j in range(2, i + 1):        print(j, end=' ')
print()
