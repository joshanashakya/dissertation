for _ in range(int(input())):     n, k, s = map(int, input().split())    t = list(map(int, input().split()))     if k not in t: print(0)    else:        dist = 1        while k + dist <= n or k - dist >= 1:            if k + dist > n:                if k - dist not in t: break            elif k - dist <= 0:                if k + dist not in t: break            elif k + dist not in t or k - dist not in t: break            dist += 1        print(dist)