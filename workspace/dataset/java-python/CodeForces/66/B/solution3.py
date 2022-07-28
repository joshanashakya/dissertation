import sysimport

mathdef
fn(n, a): m = 0
k1 = 0
k2 = 0
for i in range(n):        c = 0
k1 = i
for j in range(i + 1, n):            if
a[k1] >= a[j]: c = c + 1
k1 = j else:                break
k2 = i
for j1 in range(i, -1, -1):            if
a[k2] >= a[j1]: c = c + 1
k2 = j1 else:                break
if c > m:            m = c
return mif
__name__ == '__main__': input = sys.stdin.read()
data = list(map(int, input.split()))
n = (data[0])
h = data[1:]
print(fn(n, h))
