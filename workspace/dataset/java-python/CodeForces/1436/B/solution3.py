import mathfor

_ in range(int(input())): n = int(input())
if n % 2 == 0:      for
i in range(n):
for j in range(n):            if
i == j or i + j == n - 1: print(1, end=" ") else:               print(0, end=" ")
print() else:      for i in range(n):         for
j in range(n):
if i == j or i + j == n - 1:
    print(1, end=" ")             elif i == 0 and j == n // 2 or j == n - 1 and i == n // 2:
    print(1, end=" ")             else:
    print(0, end=" ")
print()
