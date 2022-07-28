from collections import Counterdef

maxSubArraySum(a, size): max1 = 0
ans = 0
for i in a:        max1 += i
if (max1 > ans):            ans = max1
return anst = int(input())
for _ in range(t):    n = int(input())
ali = list(map(int, input().split()))
m = int(input())
bli = list(map(int, input().split()))
q = maxSubArraySum(ali, n)
w = maxSubArraySum(bli, m)  # print(q,w)    e = q+w    print(e)   
