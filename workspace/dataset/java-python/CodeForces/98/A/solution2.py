from collections import defaultdict

a = defaultdict(int)
for c in input(): a[c] += 1
s = tuple(sorted(a.values()))
res = {
    (6,): 1,
    (1, 5): 1,
    (2, 4): 2,
    (1, 1, 4): 2,
    (3, 3): 2,
    (1, 2, 3): 3,
    (1, 1, 1, 3): 5,
    (2, 2, 2): 6,
    (1, 1, 2, 2): 8,
    (1, 1, 1, 1, 2): 15,
    (1, 1, 1, 1, 1, 1): 30,
}
print(res[s])
