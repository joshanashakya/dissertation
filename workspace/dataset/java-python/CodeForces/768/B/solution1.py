from sys import stdinimport math #从这里的calnum打表判断出num[n] = n# def calnum(n):#     if n == 0 or n == 1:#         return n#     return 2 * calnum(n // 2) + calnum(n % 2) #python的math.log函数不精确。。。def Log(n):    for i in range(52):        num = int(math.pow(2, i))        if n < num:            return i - 1 def dfs(n, nl, nr, l, r):    if l <= nl and r >= nr:        return n    mid = (nl + nr) // 2    num = 0    if mid >= l and mid <= r:        num += n % 2    if l < mid:        num += dfs(n // 2, nl, mid - 1, l, r)    if r > mid:        num += dfs(n // 2, mid + 1, nr, l, r)    return num n, l, r = map(int, stdin.buffer.readline().split()) if n == 0:    print(0)    exit() num = Log(n)nl, nr = 1, int(math.pow(2, num + 1)) - 1 ans = dfs(n, nl, nr, l, r)print(ans)
