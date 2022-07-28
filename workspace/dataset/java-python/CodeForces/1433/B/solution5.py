for _ in range(int(input())):    n = int(input())
arr = list(map(int, input().split()))
start = arr.index(1)
end = n - arr[::-1].index(1) - 1
print(arr[start:end + 1].count(0))
