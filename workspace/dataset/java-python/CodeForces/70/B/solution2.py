n = int(input())
s = input()
sens = [[]]
for i in s:    sens[-1].append(i)
if i in ['.', '!', '?']:        sens.append([])
for i in range(len(sens)):    if
sens[i]: sens[i] = ''.join(sens[i])
sens[i] = sens[i].strip()
if len(sens[i]) > n:            print('Impossible')
exit(0)
sens.pop() i = 0
ans = 0
while i < len(sens):    l = len(sens[i])
while i + 1 < len(sens) and l + 1 + len(sens[i + 1]) <= n:        i += 1
l += len(sens[i]) + 1
i += 1
ans += 1
print(ans)
