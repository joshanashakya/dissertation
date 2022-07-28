import sysfor

_ in range(int(input())): n, k = map(int, input().split())
li = list(map(int, input().split()))
tmp = 0
res = sys.maxsize
mx = max(li)
for i in range(1, mx + 1):        tmp = 0
cnt = 0
while cnt < n:            if
li[cnt] != i: tmp += 1
cnt += k else:                cnt += 1
if tmp < res:            res = tmp
print(res)
