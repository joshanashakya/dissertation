from collections import defaultdict n, m = map(int, input().split())tmp = list(tuple(map(int, input().split())) for _ in range(n))nails = [abs(a - c) + abs(b - d) for (a, b), (c, d) in zip(tmp, tmp[2:] + tmp[:2])]segments = defaultdict(list)for i, s in enumerate(map(int, input().split()), 1):    segments[s].append(i)for shift in -1, 0:    res = [-1] * n    for nailidx in range(shift, n + shift, 2):        nail = nails[nailidx]        if nail in segments and segments[nail]:            res[(nailidx + 1) % n] = segments[nail].pop()        else:            break    else:        print("YES")        print(" ".join(map(str, res)))        exit(0)print("NO")