from sys import stdin n, k = [int(x) for x in stdin.readline().split()] a = [int(x) for x in
                                                                             stdin.readline().split()] if sum(a) < k:
    print(-1)elif sum(a) == k:
    passelse: diff = 0
kCopy = k
sortA = sorted(a, reverse=True)     while sortA:        nxt = sortA[-1]
nxt -= diff         if len(sortA) * nxt <= k:            diff += nxt
k -= len(sortA) * nxt
sortA.pop() else:            break
p = k % len(sortA)
diff += k // len(sortA)
ind = 0     while p:        if
a[ind] > diff: p -= 1
ind += 1
outL = []     for x in range(ind, len(a)):        if
a[x] > diff: outL.append(str(x + 1))
for x in range(ind):        if
a[x] > diff + 1: outL.append(str(x + 1))
if outL:        print(' '.join(outL))
