import sysinput = sys.stdin.readline n = int(input())a = [int(i) for i in input().split()]x, y = a.index(1), a.index(n)ans = max(x, y, n - x - 1, n - y - 1) print(ans)
