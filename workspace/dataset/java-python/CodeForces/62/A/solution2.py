al, ar = map(int, input().split())
bl, br = map(int, input().split())
if 2 * (al + 1) >= br >= al - 1 or 2 * (ar + 1) >= bl >= ar - 1:
    print("YES")else:
    print("NO")
