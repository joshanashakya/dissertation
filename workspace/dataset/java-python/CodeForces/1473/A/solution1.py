tests = int(input()) for test in range(tests):    n, d = map(int, input().split())
a = [int(x) for x in input().split()]
a.sort()     if max(a) <= d:
    print("YES")    else:
    b = [a[0] + a[1] if x >= d else x for x in a]
if max(b) <= d:
    print("YES")        else:
    print("NO")
