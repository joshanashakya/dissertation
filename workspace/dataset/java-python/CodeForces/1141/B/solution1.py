from itertools import groupbyn = int(input())A = list(map(int, input().split()))B = A * 2g = groupby(B)ans = max(len(list(v)) if k == 1 else 0 for k, v in g)print(ans)
