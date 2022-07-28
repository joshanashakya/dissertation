import mathimport collections def solve(n, l):    return max(l) - (sum(l) - max(l)) + 1 n = int(input())l = [int(s) for s in input().split()]result = solve(n, l)print(result)
