import mathimport collectionsimport bisect def solve(n, x, a):    if x - sum(a) == n - 1:        return "YES"    return "NO" n, x = [int(s) for s in input().split()]a = [int(s) for s in input().split()]result = solve(n, x, a)print(result)
