import mathT = int(input())for _ in range(T):    N = int(input())    S = input()    T = input()    if any(a>b for a,b in zip(S,T)):        print(-1)        continue    s = set()    for a,b in zip(S,T):        if a==b: continue        s.add(a+b)    ans = 0    while s:        m = min(s)        ans += 1        t = set()        for a,b in s:            if a != m[0]:                t.add(a+b)                continue            if m[1]==b: continue            t.add(m[1]+b)        s = t    print(ans)