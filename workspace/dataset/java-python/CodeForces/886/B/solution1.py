n = int(input())r = lambda : list(map(int, input().split()))arr = r() x = set(arr)arr = arr[::-1]y = set()for i in arr:    y.add(i)    if len(y) == len(x):        print(i)        break
