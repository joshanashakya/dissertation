n, m = map(int, input().split())arr = list(map(int, input().split()))for i in range(n):    arr[i] = (arr[i], i)arr.sort()res = [0] * nfor i in range(n):    res[arr[i][1]] = i % 2print(*res)
