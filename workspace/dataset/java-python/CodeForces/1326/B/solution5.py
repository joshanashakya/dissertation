n = int(input()) arr = list(map(int, input().split())) curr_mx = 0 for i in range(n):    arr[i] += curr_mx    if arr[i] > curr_mx:        curr_mx = arr[i] print(*arr)  
