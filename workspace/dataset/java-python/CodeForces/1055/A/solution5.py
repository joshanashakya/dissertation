s,n = map(int,input().split())l1 = list(map(int,input().split()))l2 = list(map(int,input().split()))f = 0if l1[0] == 1:    if l1[n-1] == 1:        print("YES")    else:        for i in range(n,s):            if l1[i] == 1 and l2[n-1] == 1 and l2[i] == 1:                f = 1                break        if f == 1:            print("YES")        else:            print("NO")else:    print("NO")