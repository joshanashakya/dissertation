l = int(input())a = [int(bruh) for bruh in input().split()] a1 = sorted(a) cnt = 0for x in range(l):    if a[x] != a1[x]:        cnt += 1 if cnt <= 2:    print("YES")else:    print("NO")
