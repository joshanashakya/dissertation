n = int(input())r = lambda : list(map(int, input().split()))arr = r()arr.sort()if sum(arr[:n]) != sum(arr[n:]): print(*arr)else: print(-1) 
