n = int(input())lst = [int(i) for i in input().split()] for i in range(n-1):    print(lst[i]+lst[i+1], end=' ')print(lst[n-1])
