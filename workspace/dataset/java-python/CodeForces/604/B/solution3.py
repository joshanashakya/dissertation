n, k = map(int, input().split())arr = list(map(int, input().split()))[::-1]high = arr[0]for i in range(k, n):    high = max(high, arr[i] + arr[2 * k - i - 1])print(high)
