t = int(input())for _ in range(t):    p, f = map(int, input().split())    cnts, cntw = map(int, input().split())    s, w = map(int, input().split())    ans = 0    for x1 in range(min(p // s, cnts) + 1):        y1 = min(cntw, (p - x1 * s) // w)        cs = cnts - x1        cw = cntw - y1        low = 0        high = cs + cw + 1        while low < high:            mid = (low + high) // 2            ok = True            total = 0            if s <= w:                if mid <= cs:                    total = mid * s                else:                    total = cs * s + min(mid - cs, cw) * w            else:                if mid <= cw:                    total = mid * w                else:                    total = cw * w + min(mid - cw, cs) * s            if total <= f:                low = mid + 1            else:                high = mid        ans = max(ans, x1 + y1 + low - 1)    print(ans)
