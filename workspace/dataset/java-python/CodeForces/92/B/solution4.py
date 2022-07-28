a = input()[::-1].replace('', ' ').split()
z = len(a) - 1
ans = 0
i = 0
while i < z:
    if a[i] == '0':
        while i < z and a[i] == '0': i += 1;ans += 1
    else:
        ans += 1
        while i < z and a[i] == '1': i += 1;ans += 1
        if i == z: ans += 1
        a[i] = '1'
print(ans)
