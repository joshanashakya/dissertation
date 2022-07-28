a=int(input());l=[list(map(int,input().split()[1:])) for _ in " "*a]for i in range(a):    for j in range(a):        if i!=j and all(k in l[i] for k in l[j] ):print("NO");break    else:print("YES")
