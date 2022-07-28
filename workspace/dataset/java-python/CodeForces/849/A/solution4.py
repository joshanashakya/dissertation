n = int(input())g = list(map(int, input().split())) if len(g) % 2 == 1 and g[0] % 2 == 1 and g[-1] % 2 == 1:    print("YES")else:    print("NO")
