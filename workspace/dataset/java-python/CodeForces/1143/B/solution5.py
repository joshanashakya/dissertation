def f(n):    l = []    while n>0:        l.append(n%10)        n = n//10    l.reverse()    ll = len(l)    p1 = 1    pl = []    for i in range(ll):        p2  = l[i] if i==ll-1 else max(l[i]-1,1)*9**(ll-i-1)        pl.append(p1*p2)        p1 *= l[i]    return max(pl) n = int(input())print(f(n))