def spoilt(arr):    arr = [0] + arr


ans = [0, 0]
cnt = 0
temp = 0
flag = False
for i in range(1, len(arr)):        if
arr[i] != i and flag == False: ans[0] = i
temp = i
flag = True
if arr[i] == temp:            ans[1] = i
break
arr = arr[:ans[0]] + arr[ans[0]:ans[1] + 1][::-1] + arr[ans[1] + 1:]
if arr != sorted(arr):        print(0, 0)
return ""
print(*ans)
return "" a = int(input())
lst = list(map(int, input().strip().split()))
print(spoilt(lst))
