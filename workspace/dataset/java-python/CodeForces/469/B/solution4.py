def s(a, b):    return set(range(a, b+1)) p, q, l, r = map(int, input().split()) fixed = set()movable = set() for i in range(p):    a, b = map(int, input().split())    fixed = fixed.union(s(a, b)) for i in range(q):    a, b = map(int, input().split())    movable = movable.union(s(a, b)) ans = 0 for i in range(l, r+1):    movable_new = set([x+i for x in movable])    if movable_new.intersection(fixed) != set():        ans += 1 print(ans)