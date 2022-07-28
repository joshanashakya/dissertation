for _ in range(int(input())):    n = int(input())
a = input()
c = input()
r = b = 0
for i in range(n):        if
a[i] == c[i]:
continue elif a[i] > c[i]: r += 1 else:            b += 1
if r > b:
    print("RED")    elif b > r:
    print("BLUE")    else:
    print("EQUAL")
