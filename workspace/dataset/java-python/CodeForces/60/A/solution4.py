n, m = map(int, input().split())
l = [int(i) for i in range(1, n + 1)]
for i in range(m):    p = input().split()
if p[2] == 'left':        h = int(p[-1])
if h not in l:            if
min(l) > h: print(-1);
exit() else:            l = l[:l.index(h)]
if l == []:
    print(-1);exit()    else:
    h = int(p[-1])
if h not in l:            if
max(l) < h: print(-1);
exit() else:            l = l[l.index(h) + 1:]
if l == []: print(-1);exit()
print(len(l))
