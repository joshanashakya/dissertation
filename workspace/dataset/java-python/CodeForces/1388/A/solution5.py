import math

for _ in range(int(input())):
    x = int(input())
    if x <= 30:
        print("NO")
    elif x == 36 or x == 44 or x == 40:
        print("YES")
        print(6, 10, 15, x - 31)
    else:
        print('YES')
        print(6, 10, 14, x - 30)
