n,d,h=map(int,input().split())if n ==2:    if d == h and d == 1:        print('1 2')    else:        print(-1)elif d== 1 or d>2*h:    print(-1)else:    for i in range(h):        print(i+1,i+2)     for i in range(d-h):        print(1 if i==0 else i+h+1,i+h+2)        for i in range(d+1,n):        print(2 if d==h else 1, i+1)  