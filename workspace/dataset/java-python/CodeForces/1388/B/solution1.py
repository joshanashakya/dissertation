for _ in range(int(input())):
    n = int(input())
    tmp = (n + 3) // 4
    for i in range(n - tmp):
        print(9, end='')
    for i in range(tmp):
        print(8, end='')
    print()
