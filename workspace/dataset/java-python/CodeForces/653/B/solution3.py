p = ["a", "b", "c", "d", "e", "f"]  def cond(item):    return item[0] in p and item[1] in p  def dp():    arr = [[0 for j in range(6)] for i in range(n)]    for j in range(6):        arr[0][j] = 1    for i in range(1, n):        for j in range(6):            for item in d:                if cond(item) and d[item] == j:                    x = ord(item[0]) - ord("a")                    arr[i][j] += arr[i - 1][x]    return arr[-1][0]  n, k = map(int, input().split())d = {}for i in range(k):    a, b = input().split()    d[a] = ord(b) - ord("a")print(dp())
