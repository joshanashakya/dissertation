import arrayimport

collectionsfrom
collections
import defaultdictimport

math mxN = 2e5 + 10
n = int(input())
a = list(map(int, input().split()))
Rs = [0] * (n + 10)
Ls = [0] * (n + 10)
for i in range(1, n):    if
a[i] > a[i - 1]: Ls[i] = Ls[i - 1] + 1
for i in range(n - 2, -1, -1):    if
a[i + 1] < a[i]: Rs[i] = Rs[i + 1] + 1
mx = max(*Rs, *Ls)
c = 0
for i in range(0, n):    if
mx == Rs[i]: c += 1
if mx == Ls[
    i]:        c += 1  # print(Ls[i], Rs[i])for i in range(0, n):  if c == 2 and mx % 2 == 0 and Ls[i] == Rs[i] and Ls[i] == mx:      print(1)      exit(0) print(0)
