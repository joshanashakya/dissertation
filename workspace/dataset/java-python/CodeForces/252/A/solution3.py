n = int(input())arr = list(map(int, input().split()))max_xor = -19999for i in range(1, n+1):    for j in range(n-i+1):        cur_xor = arr[j]        for h in range(j, j+i-1):            cur_xor = cur_xor^arr[h+1]        max_xor = max(cur_xor, max_xor)print(max_xor)