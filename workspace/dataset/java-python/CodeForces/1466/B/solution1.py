t = int(input())
for i in range(t):    n = int(input())
x = list(map(int, input().split()))
l = set()
for j in x:        if
j not in l: l.add(j) else:            l.add(j + 1)
l1 = set()  # print (l)    for j in l:        if j not in l1:            l1.add(j)    print (len(l1))
