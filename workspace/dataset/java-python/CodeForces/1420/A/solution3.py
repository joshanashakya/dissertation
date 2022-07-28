for u in range(int(input())):    n = int(input())
x = [int(w) for w in input().split()]
f = False
for i in range(n - 1):        if
    (x[i] <= x[i + 1]): f = True
break
if (f):
    print("YES")    else:
    print("NO")
