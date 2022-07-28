n = int(input())

if (n <= 9):
    print(n)

else:
    while (n > 9):
        m = n
        s = 0
        while (m != 0):
            a = m % 10
            s += a
            m = m // 10
        n = s
    print(s)
