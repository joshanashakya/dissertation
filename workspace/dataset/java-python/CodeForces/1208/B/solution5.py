from bisect import bisect_left, bisect_rightfrom collections import Counter, defaultdict R = lambda: map(int, input().split())n = int(input())arr = list(R())idxes = defaultdict(list)for i, num in enumerate(arr):    idxes[num].append(i)res = nfor st in range(n):    ed = st    for idxArr in filter(lambda x: len(x) > 1, idxes.values()):        if bisect_left(idxArr, st) > 1:            ed = -1            break        ed = max(ed, idxArr[-1 if bisect_left(idxArr, st) == 1 else -2] + 1)    if ed > -1:        res = min(res, ed - st)print(res)