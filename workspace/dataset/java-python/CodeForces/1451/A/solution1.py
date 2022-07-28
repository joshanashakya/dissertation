def solve(n):    if


n == 1:
return 0 elif n == 2:
return 1 elif n == 3:
return 2 else:        if n % 2 == 0:
    return 2        else:
    return 3 t = int(input())
for tc in range(t):    n = int(input())
print(solve(n))
