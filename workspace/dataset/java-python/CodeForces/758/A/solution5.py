n = int(input())arr = list(map(int,input().split()))maxnum = max(arr)total = 0for num in arr:    total+=(abs(maxnum-num))print(total)
