from collections import Counter n = int(input()) arr = [int(i) for i in input().split()]c = Counter(arr) for i in range(len(arr)):    if c[arr[i]] > 1:        c[arr[i]] -= 1        arr[i] = -1 print(len(c)) for i in arr:    if i != -1:        print(i, end=' ')