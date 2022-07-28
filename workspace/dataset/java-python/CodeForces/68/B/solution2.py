n, k = list(map(int, input().split()))
arr = list(map(int, input().split())) 

def bins():    l = 0


r = 10000000000000
for i in range(100):        mid = (l + r) / 2
if f(mid):
    l = mid        else:
    r = mid
print(l)  

def f(s):    sent = 0


sentR = 0
for i in range(n):        if
arr[i] < s: sentR += ((s - arr[i]) * 100) / (100 - k) elif arr[i] > s: sent += arr[i] - s
return sent >= sentRbins()
