n = int(input())arr = list(map(int, input().split()))max = 0for i in range(1, n):    if arr[max] < arr[i]:        max = iarr.sort()print(max+1, arr[-2])
