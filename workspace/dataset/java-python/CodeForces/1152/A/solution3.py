I = lambda: map(int, input().split())n, m = I()x = sum(a%2 for a in I())y = sum(b%2 for b in I())print(min(x, m-y) + min(y, n-x))
