for t in range(int(input())):    n = int(input())
a = list(map(int, input().split()))
i = 0
j = n - 1
result = [0] * n
while i < j:        result[i] = -a[j]
result[j] = a[i]
i += 1
j -= 1
print(" ".join(str(x) for x in result))
