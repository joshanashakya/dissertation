import io, os, sysfrom

math
import ceil

input = io.BytesIO(os.read(0, os.fstat(0).st_size)).readline


def sswrite(val):    sys.stdout.write(str(val) + '\n')


def intmap():    return map(int, input().decode().split(' '))


t = int(input().decode())


def solve(n, x, a):    x1 = ceil(sum(a) / x)


x2 = 0
for i in range(n):        x2 += ceil(a[i] / x)
return f'{x1} {x2}'
for i in range(t):    n, x = intmap()
a = list(intmap())
print(solve(n, x, a))
