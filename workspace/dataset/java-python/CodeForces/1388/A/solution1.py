t = int(input())
for i in range(t):
    n = int(input())
    if n < 31:
        print('NO')
    else:
        print('YES')
        a = n - 30
        if a != 6 and a != 10 and a != 14:
            print(6, 10, 14, a)
        else:
            print(6, 10, 15, n - 31)
