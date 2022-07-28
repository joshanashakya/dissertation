n = int(input())arr = [int(x) for x in input().split()]s = 0for i in range(1,n+1):    if i not in arr:        s +=1print(s)
