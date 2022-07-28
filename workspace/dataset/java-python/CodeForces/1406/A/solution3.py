cases = int(input())
while cases:    cases -= 1
num = int(input())
arr = list(map(int, input().split()))     st1 = -1
st2 = -1
broken = False
for i in range(101):        if
i not in arr:
break else:            if arr.count(i) > 1 and not broken:                st1 += 1
st2 += 1 else:                st1 += 1
broken = True     print(2 + st1 + st2)
