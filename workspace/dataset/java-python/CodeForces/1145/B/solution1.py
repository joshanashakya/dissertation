import sysinput=sys.stdin.readline t = 1 for _ in range(t):    n = int(input())        l = [1,7,9,10,11,13,14,15,16,17,18,19]        flag = 1        d = n//10        if d==2 or d==7 or d==9:        flag = 0            if n in l:        flag = 0        n %= 10    if n in l:        flag = 0        if flag:        print("YES")    else:        print("NO")