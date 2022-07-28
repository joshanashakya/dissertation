import sysfor

x in range(int(input())): a, b = map(int, input().split())
s = input()
s = s.strip('0')
if '1' not in s or s == []:        print(0)
continue
ans = a
zero = 0
for i in s:        if
i == '0': zero += 1
if i == '1':            if
zero > 0: ans += min(a, zero * b)
zero = 0
print(ans)
