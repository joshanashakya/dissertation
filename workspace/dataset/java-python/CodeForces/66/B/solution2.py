import sysfrom

collections
import Counterdef

f1(n, l): m = 0
k1 = 0
k2 = 0
for i in range(n):        c = 0
k1 = i
for j in range(i + 1, n):            if
l[k1] >= l[j]: c = c + 1
k1 = j else:                break
k2 = i
for j1 in range(i, -1, -1):            if
l[k2] >= l[j1]: c = c + 1
k2 = j1 else:                break
if c > m:            m = c
return m                        if __name__ == '__main__':        input = sys.stdin.read()
data = list(map(int, input.split()))
n = data[0]
l = data[1:]
print(f1(n, l))
