for _ in range(int(input())):    n, m = map(int, input().split())
arr = list(map(int, input().split()))
if m == sum(arr):        print('YES')  else:        print('NO')
