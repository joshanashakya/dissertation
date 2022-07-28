def solve(arr):    for i in range(len(arr)):        if arr[i] % 2 == 0:            arr[i] -= 1    return " ".join(str(i) for i in arr) input()arr = list(map(int, input().split()))print(solve(arr))
