import bisectimport collectionsimport copyimport functoolsimport heapqimport itertoolsimport mathimport randomimport reimport sysimport timeimport stringfrom typing import Listimport operator n = int(input())arr = list(map(int, input().split())) cs = collections.Counter(arr) ans = []if cs[1] and cs[3] and cs[6]:    mn = min(cs[1], cs[3], cs[6])    for i in range(mn):        ans.append([1, 3, 6])    cs[1] -= mn    cs[3] -= mn    cs[6] -= mn if cs[1] and cs[2] and cs[6]:    mn = min(cs[1], cs[2], cs[6])    for i in range(mn):        ans.append([1, 2, 6])    cs[1] -= mn    cs[2] -= mn    cs[6] -= mn if cs[1] and cs[2] and cs[4]:    mn = min(cs[1], cs[2], cs[4])    for i in range(mn):        ans.append([1, 2, 4])    cs[1] -= mn    cs[2] -= mn    cs[4] -= mn if sum(cs.values()) > 0:    print(-1)else:    for k in ans:        print(*k)
