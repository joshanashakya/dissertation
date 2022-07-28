def magical(arr):    curr = None


currn = 0
ans = []
for i in arr:        if
curr != i: ans.append(currn)
currn = 1
curr = i else:            currn += 1
ans.append(currn)
cnt = 0
for i in ans:        cnt += ((i) * (i + 1)) // 2
return cnt a = input()
lst = list(map(int, input().strip().split()))
print(magical(lst))
