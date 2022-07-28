for _ in range(int(input())):    n, m = list(map(int, input().split()))
mat = []
value = 0
for i in range(n):        mat.append(list(map(int, input().split())))
for i in range(n):        for
j in range(m): a = list(sorted([mat[i][j], mat[n - i - 1][j], mat[i][m - j - 1], mat[n - i - 1][m - j - 1]]))
value += (a[1] - a[0]) + (a[2] - a[1]) + (a[3] - a[1])      print(value // 4)
