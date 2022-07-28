l = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53]
x, y = map(int, input().split())
if (l[l.index(x) + 1] == y):
    print("YES")else:
    print("NO")
