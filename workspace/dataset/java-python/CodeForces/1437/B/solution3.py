def alternate_string(n, s):       low = 1


high = n - 2
flag1 = flag2 = 0
for i in range(n - 1):              if
s[low] == '0' and s[low - 1] == '1': flag1 += 1
if s[high] == '0' and s[high + 1] == '1':                     flag2 += 1
low += 1
high -= 1
return n // 2 - max(flag1, flag2) for i in range(int(input())):       n = int(input())
s = input()
print(alternate_string(n, s))
