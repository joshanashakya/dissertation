for _ in range(int(input())):
    n, m = map(int, input().split())
    li = []
    c = 0
    for i in range(n):
        s = input()
        if s[-1] == 'R':
            c += 1
        li.append(s)
    for i in li[-1]:
        if i == 'D':
            c += 1
    print(c)
