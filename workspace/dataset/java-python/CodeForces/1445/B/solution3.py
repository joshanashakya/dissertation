for _ in range(int(input())):    a, b, c, d = [int(j) for j in input().split()]
e = a + b
f = c + d
if e > f:
    print(e)    else:
    print(f)
