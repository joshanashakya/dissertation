for _ in range(int(input())):    n = int(input())
arr = [1, 1] + [0] * (n - 2)
arr = arr + arr
for i in range(n):        for
j in range(i, n + i): print(arr[j], end=' ')
print()
