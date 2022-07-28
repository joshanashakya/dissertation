for i in range(int(input())):
    n, m = [int(i) for i in input().split()]
    a = []
    for i in range(n):
        a.append(input().strip())
    x = 0
    for i in a[-1]:
        x += int(i == 'D')
    for i in a:
        x += int(i[-1] == 'R')
    print(x)
