def read_data():    n = int(input())    ps = list(map(int, input().split()))    return n, ps def solve(n, ps):    ps = [p - 1 for p in ps]    cycles = [0] * n    roots = []    has_odd_cycle = False    for i in range(n):        if cycles[i] > 0:            continue        q = ps[i]        cycle = 1        while q != i:            cycle += 1            q = ps[q]        if cycle & 1:            has_odd_cycle = True        cycles[i] = cycle        roots.append(i)        q = ps[i]        while q != i:            cycles[q] = cycle            q = ps[q]    mincycle = min(cycles)    if mincycle > 2:        return False, []    if mincycle == 1:        p = cycles.index(1)        return True, [(p, i) for i in range(n) if i != p]    if has_odd_cycle:        return False, []    p = cycles.index(2)    q = ps[p]    edges = [(p, q)]    for root in roots:        if root == p or root == q:            continue        edges.append((p, root))        r = ps[root]        edges.append((q, r))        r = ps[r]        while r != root:            edges.append((p, r))            r = ps[r]            edges.append((q, r))            r = ps[r]    return True, edges n, ps = read_data()is_possible, edges = solve(n, ps)if is_possible:    print('YES')    for a, b in edges:        print(a + 1, b + 1)else:    print('NO')