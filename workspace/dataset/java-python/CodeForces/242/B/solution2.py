n = int(input())p = []al = []bl = []while n > 0:    n -= 1    a, b = map(int, input().split())    p.append([a, b])    al.append(a)    bl.append(b)t1 = min(al)t2 = max(bl)if [t1, t2] in p:    print(p.index([t1, t2]) + 1)else:    print(-1)
