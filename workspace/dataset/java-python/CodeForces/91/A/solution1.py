from bisect import bisect_left as bla, b = input(), input()
f = dict((c, [i for i, x in enumerate(a) if x == c]) for c in set(
    a))  # print(f)p,z = -1,1try:    for c in b:        p = bl(f[c],p)        if p>=len(f[c]): p,z=0,z+1        p=f[c][p]+1    print(z)except:    print(-1)
