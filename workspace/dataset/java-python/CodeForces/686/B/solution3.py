n = int(input())arr = list(map(int, input().split()))  for i in reversed(range(len(arr))):    for j in range(1, i + 1):        if arr[j - 1] > arr[j]:            print(j, j + 1)            arr[j - 1], arr[j] = arr[j], arr[j - 1]                   
