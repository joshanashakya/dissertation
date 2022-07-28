for _ in range(int(input())):    n = int(input())
s = input()
t = "1"
p = s[0]
for i in s[1:]:        if
i == '1':
if t[-1] == '1' and p == '1':
    t += '0'            else:
    t += '1' else:            if (t[-1] == '1' and p == '0') or (t[-1] == '0' and p == '1'):
    t += '0'            else:
    t += '1'
p = i
print(t)
