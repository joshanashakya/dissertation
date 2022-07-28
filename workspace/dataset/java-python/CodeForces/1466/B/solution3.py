for t in range(int(input())):    n = int(input())
a = list(map(int, input().split()))
count = [0] * (2 * n + 2)
for i in a: count[i] += 1
for i in range(len(a) - 1, -1, -1):        if
count[a[i] + 1] == 0: count[a[i] + 1] += 1
count[a[i]] -= 1
a[i] += 1
print(len(set(a)))
