import sysimport

itertoolsimport
collections 

def rs(x=''):    if


len(x) == 0:
return sys.stdin.readline().strip()
return input(x).strip() 

def ri(x=''): return int(rs(x))


def rm(x=''): return map(str, rs(x).split())


def rl(x=''): return rs(x).split()


def rmi(x=''): return map(int, rl(x))


def rli(x=''): return [int(val) for val in rl(x)]


def println(val): sys.stdout.write(str(val) + '\n')

 

def mirror(val):    mirrored = [0, 1, 5, -1, -1, 2, -1, -1, 8, -1]


a, b = val // 10, val % 10
if mirrored[a] == -1 or mirrored[b] == -1:        return -1
return mirrored[b] * 10 + mirrored[a] 

def solve(testCase):    h, m = rmi()


time = rs()
hour, minute = time[:2], time[3:]
hour = int(hour) * m + int(minute)
while True:        h2, m2 = mirror(hour // m % h), mirror(hour % m)
h2, m2 = m2, h2
if h2 >= 0 and m2 >= 0 and h2 < h and m2 < m:            break
hour += 1
h = hour // m % h
m = hour % m
ans = []
if h < 10:        ans += ['0']
ans += [str(h), ':']
if m < 10:        ans += ['0']
ans += [str(m)]  # print('!', ''.join(ans))    print(''.join(ans))  for _ in range(ri() if 1 else 1):    solve(_ + 1)
