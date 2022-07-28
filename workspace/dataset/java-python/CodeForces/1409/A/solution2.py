cases = int(input())
for i in range(cases):    a, b = map(int, input().split())
temp = abs(a - b)
count = 0
if temp == 0:
    print(0)    else:
    count = temp // 10
temp = temp - 10 * count
if temp % 10 != 0:            count += 1         print(count)
