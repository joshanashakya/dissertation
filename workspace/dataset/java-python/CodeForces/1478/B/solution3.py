t = int(input())
for _ in range(t):    q, d = map(int, input().split())
arr = list(map(int, input().split()))
for i in arr:        if
str(d) in str(i): print("YES")
continue
if i >= 10 * d or i % d == 0:            print("YES")
continue
temp = i
while temp > 0:            if
str(d) in str(temp): print("YES")
break else:                temp -= d
continue
if temp <= 0:            print("NO")                                                         
