for x in range(int(input())):    a, b = map(int, input().split())
c = abs(a - b)
if c % 10 == 0:
    print(c // 10)    else:
    print((c // 10) + 1)
