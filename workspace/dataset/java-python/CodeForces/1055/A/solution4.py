n, s = map(int, input().split())a = list(map(int, input().split()))b = list(map(int, input().split()))if a[0] == 1:    if a[s-1] == 1:        print("YES")    elif b[s-1] == 1:        flag = True        for i in range(s, n):            if a[i] == 1 and b[i] == 1:                print("Yes")                flag = False                break        if flag:            print("NO")    else:        print("NO")else:    print("NO")
