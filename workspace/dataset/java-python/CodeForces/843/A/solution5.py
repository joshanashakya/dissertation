import sysinput = sys.stdin.readline from bisect import bisect_left as bs ''' ''' def solve(n, a):    b = a[::]    b.sort()    done = [0] * n     res = []    for i in range(n):        if not done[i]:            if a[i] == b[i]:                res.append([i+1])                done[i] = 1            else:                r = []                while not done[i]:                    r.append(i+1)                    done[i] = 1                    i = bs(b, a[i])                res.append(r)    return res                 n = int(input())a = list(map(int, input().split())) res = solve(n,a)print(len(res))for r in res:    print(len(r), *r)
