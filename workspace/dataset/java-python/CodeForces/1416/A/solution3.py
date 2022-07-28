from collections import defaultdictdef

function(A): n = len(A)
hash = defaultdict(lambda: [0, -1])
for i in range(n):        prev = hash[A[i]][1]
dist = i - prev
hash[A[i]] = [max(hash[A[i]][0], dist), i]
visited = set()
for i in range(n - 1, -1, -1):        if
A[i] not in visited: visited.add(A[i])
hash[A[i]][0] = max(hash[A[i]][0], n - hash[A[i]][1])
z = dict()
for u in hash.keys():        z[u] = hash[u][0]
length_to_x = defaultdict(lambda: 2 ** 36)
for key in z:        length_to_x[z[key]] = min(length_to_x[z[key]], key)
res = [2 ** 36 for i in range(n)]
if len(set(A)) != 1:
    res[0] = 2 ** 36    else:
    res[0] = A[0]
for i in range(1, n):        length = i + 1
res[i] = res[i - 1]
if length in length_to_x:            res[i] = min(res[i], length_to_x[length])
for i in range(n):        if
res[i] == 2 ** 36: res[i] = -1
return rest=int(input())
for u in range(t):    n = int(input())
A = [int(k) for k in input().split()][:n]
B = function(A)
for x in B:        print(x, "", end='')
print()
