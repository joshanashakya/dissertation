n,k,m = map(int, input().split())t = sorted(map(int, input().split()), key=int)s = sum(t)ans = 0 for i in range(n+1):    curr_ans = i*(k+1)    tot = m - i*s    if tot < 0:        break     for x in t:        c = min(n-i, tot//x)        if not c:            break        tot -= c*x        curr_ans += c     ans = max(ans, curr_ans) print(ans)
