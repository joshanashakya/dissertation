n = int(input())arr = list(map(int, input().split())) k = sum(arr)//nmoves = 0 for i in range(n - 1):        arr[i + 1] += arr[i] - k    moves += abs(k - arr[i])    print(moves)
