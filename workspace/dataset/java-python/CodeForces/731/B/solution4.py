def solve(xs):    n = len(xs)    for i in range(n - 1):        if xs[i] % 2 != 0:            if xs[i + 1] > 0:                xs[i + 1] -= 1            else:                return False    return xs[n - 1] % 2 == 0 n = int(input())a = [int(s) for s in input().split()]print("YES" if solve(a) else "NO")
