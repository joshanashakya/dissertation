gf = input().split()
bf = input().split() al, ar = int(gf[0]), int(gf[1])
bl, br = int(bf[0]), int(bf[1]) if ar - 1 <= bl <= 2 * ar + 2 or al - 1 <= br <= 2 * al + 2:
    print("YES")else:
    print("NO")
