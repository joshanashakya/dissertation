import sysinput = sys.stdin.readline for test in range(int(input())):    a = sorted([int(i) for i in input().split()])    if a[0] == a[2] or a[0] + 1 == a[2]:        print(0)        continue    a[0] += 1    a[1] = a[0]    a[2] -= 1    ans = abs(a[0] - a[1]) + abs(a[0] - a[2]) + abs(a[1] - a[2])    print(ans)