s = input()
f = 0
if '0000000' in s:
    print('YES')
    f = 1
if '1111111' in s:
    print('YES')
    f = 1
if f == 0:
    print('NO')
