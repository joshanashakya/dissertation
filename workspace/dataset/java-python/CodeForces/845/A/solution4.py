n = int(input())a = list(map(int, input().split()))a = sorted(a)if a[n - 1] == a[n]:    print('NO')else:    print('YES')
