r = lambda: list(map(int, input().split()))
arr = r()
c = 0
i = 0
while arr.count(0) != 3:    arr[i % 3] = max(0, arr[i % 3] - 2)
c += 1
i += 1 print(29 + c)
