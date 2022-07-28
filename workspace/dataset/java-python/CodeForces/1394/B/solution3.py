import copy
from itertools import permutations
from collections import defaultdict
import sys
import io
import os

input = io.BytesIO(os.read(0, os.fstat(0).st_size)).readline


def main():
    n, m, k = map(int, input().split())

    out = [[] for _ in range(n)]

    for _ in range(m):
        u, v, w = map(int, input().split())
        u -= 1
        v -= 1

        out[u].append((w, v))

    inc = [set() for _ in range(n)]

    forbidden = set()
    for u in range(n):
        for i, (_, v) in enumerate(sorted(out[u]), start=1):
            if (len(out[u]), i) in inc[v]:
                forbidden.add((len(out[u]), i))
            else:
                inc[v].add((len(out[u]), i))

    forbidden_follow = defaultdict(set)
    for v in range(n):
        for (c1, v1), (c2, v2) in permutations(inc[v], 2):
            if c1 < c2:
                forbidden_follow[(c1, v1)].add((c2, v2))

    total = 0
    cur_forbidden = set()

    def solve(cur_k):
        nonlocal k, total, forbidden, cur_forbidden
        if cur_k == k + 1:
            total += 1
            return
        for val in range(1, cur_k + 1):
            if (cur_k, val) in forbidden or (cur_k, val) in cur_forbidden:
                continue
            old = copy.copy(cur_forbidden)
            cur_forbidden.update(forbidden_follow[(cur_k, val)])
            solve(cur_k + 1)
            cur_forbidden = old

    solve(1)
    print(total)


main()
