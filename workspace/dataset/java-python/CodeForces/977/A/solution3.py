nums = list(map(int, input().split())) n = nums[0]k = nums[1]for i in range(k):    if n % 10 == 0:        n = n/10    else:        n = n-1 print(int(n)) 
