def solve():    n = int(input())    a = [int(x) for x in input().split(' ')]    a.sort()    if a[n - 1] == a[n]:        return "NO"    else:        return "YES" print(solve())
