n, k = map(int, input().split(" "))arr = list(map(int, input().split(" "))) if k > 2:    print(max(arr))elif k == 2:    print(max(arr[0], arr[-1]))else:    print(min(arr))
