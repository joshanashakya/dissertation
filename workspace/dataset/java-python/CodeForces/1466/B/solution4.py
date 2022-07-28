for _ in range(int(input())):    n = int(input())
a = list(map(int, input().split()))
a.sort(reverse=True)
d = {}
for el in a:        d[el] = True     for i in range(n):        if
not d.get(a[i] + 1, False): d[a[i] + 1] = True
d.pop(a[i]) else:            d[a[i]] = True     print(len(d))
