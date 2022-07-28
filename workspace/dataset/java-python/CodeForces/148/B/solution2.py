p, vd, t, f, c = [int(input()) for i in range(5)]if p >= vd:    exit(print(0))cur = (p * t * vd) / (vd - p)ans = 0while c > cur:    ans += 1    cur += p * (2 * cur + f * vd) / (vd - p)print(ans)
