# [https://codeforces.com/contest/685/submission/42128998 <- https://codeforces.com/contest/685/status/B <- https://codeforces.com/contest/685 <- https://codeforces.com/blog/entry/45556 <- https://codeforces.com/problemset/problem/685/B <- https://algoprog.ru/material/pc685pB] import bisect n, q = [int(s) for s in input().split()] ps = [int(s) for s in input().split()] childs = [[] for _ in range(n)] for (c,pa) in enumerate(ps):    childs[pa-1].append(c+1)toposort = []this_level = [0]next_level = []while len(this_level) > 0:    for this_n in this_level:        toposort.append(this_n)        for c in childs[this_n]:            next_level.append(c)    this_level = next_level    next_level = [] sz = [0]*npotentials = [0]*npotential_sz = [0]*npotential_lo = [0]*ncentr = [0]*n for node in reversed(toposort):    if len(childs[node]) == 0:        centr[node] = node        sz[node] = 1    else:        s = 1        lg_c = -1        lg_c_sz = 0        for c in childs[node]:            s += sz[c]            if sz[c] > lg_c_sz:                lg_c_sz = sz[c]                lg_c = c        sz[node] = s        if lg_c_sz <= sz[node]//2:            centr[node] = node            potentials[node] = [node]            potential_sz[node] = [sz[node]]            continue         potentials[node] = potentials[lg_c]        potential_sz[node] = potential_sz[lg_c]         i = bisect.bisect_right(potential_sz[node], sz[node]//2, lo=potential_lo[lg_c])        centr[node] = potentials[node][i]         potentials[node].append(node)        potential_lo[node] = i        potential_sz[node].append(sz[node]) vs = [int(input()) - 1 for i in range(q)]print('\n'.join([str(centr[v]+1) for v in vs]))