def constructTiles(arr, n, m):    if


m & 1 != 1:
for i in range(n):            if
(arr[i][0][1] == arr[i][1][0]): print("Yes")
return print("No")
return   tc = int(input())
for _ in range(0, tc):    n, m = input().split()
n = int(n)
m = int(m)
arr = []
for i in range(n):        childArr = []
for i in range(0, 2):            a, b = input().split()
a = int(a)
b = int(b)
childArr.append([a, b])
arr.append(childArr)
constructTiles(arr, n, m)
