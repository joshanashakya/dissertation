n = int(input()) arr = list(map(int, input().split())) arr.sort(reverse=True) curr = arr[0]cnt = 0 for item in arr:    curr = min(curr, item)    cnt += curr    curr -= 1    curr = max(curr, 0)  print(cnt) 