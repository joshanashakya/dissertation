for i in range(int(input())):    n = int(input())
arr = list(map(int, input().split()))
l = list(map(int, input().split()))
new = []
ref = []
for j in range(n):        if
l[j] != 1: new.append(arr[j]) else:            ref.append((arr[j], j))
new = sorted(new)[::-1]
for x in ref:        new.insert(x[1], x[0])
print(*new)
