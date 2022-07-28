from sys import stdin for _ in range(int(stdin.readline())):    n = int(stdin.readline())
b = stdin.readline().strip()
res = [0] * n
prev = -1
for idx, val in enumerate(b):        if
val == '1':
if prev == 2:                res[idx] = '0'
prev = 1 else:                res[idx] = '1'
prev = 2 else:            if prev != 1:                res[idx] = '1'
prev = 1 else:                res[idx] = '0'
prev = 0
print(''.join(res))
