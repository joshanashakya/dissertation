n = int(input())
for i in range(n):
    a, b = [int(i) for i in input().split(' ')]
    count = 0
    for j in range(a - 1):
        s = input()
        if s[b - 1] != 'D':
            count += 1
    s = input()
    for j in s[:-1]:
        if j != 'R':
            count += 1
    print(count)
