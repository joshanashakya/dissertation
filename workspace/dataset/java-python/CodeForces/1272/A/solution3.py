import sysinput = sys.stdin.readline for test in range(int(input())):    a = sorted([int(i) for i in input().split()])    if a[0] == a[1] and a[1] == a[2]:        res = 0    else:        res = 4    ans = abs(a[0] - a[1]) + abs(a[0] - a[2]) + abs(a[1] - a[2])    print(max(0, ans - res))
