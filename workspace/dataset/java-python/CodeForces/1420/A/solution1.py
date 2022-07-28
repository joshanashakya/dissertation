for t in range(int(input())):    n = int(input())
a = list(map(int, input().split()))     d = dict()
for i in range(len(a)):        if
a[i] not in d: d[a[i]] = True     if len(d.keys()) == len(a):        k = []
for el in a:            k.append(el)         k.sort(reverse=True)
rev = True
for i in range(len(a)):            if
a[i] != k[i]: rev = False
break         if rev:
    print("NO")        else:
    print("YES")  else:        print("YES")
