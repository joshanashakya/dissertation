  a,b=[int(x) for x in input().split()]c,d=[int(x) for x in input().split()]e,f=[int(x) for x in input().split()]def do(a,b,c,d,e,f):    for i in range(1,5):        if (c+e<=a and d<=b and f<=b) or (d+f<=b and c<=a and e<=a):            return "YES"        if i%2: c,d=d,c        e,f=f,e    return "NO"print(do(a,b,c,d,e,f))