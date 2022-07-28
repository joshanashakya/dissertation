for t in range(int(input())):    n = int(input())
if n == 1:
    print(9)    elif n == 2:
    print(98)    elif n == 3:
    print(989)    else:
    print(989, end='')
for i in range(n - 3): print(i % 10, end='')
print()
