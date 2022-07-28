import sysimport

mathdef
input():
return sys.stdin.readline().strip()


def iinput():   return int(input())


def minput():   return map(int, input().split())


def listinput(): return list(map(int, input().split()))


h, w = minput()
x = 2 ** int(math.log2(h))
y = 2 ** int(math.log2(w))
if x > y:
    x = int(min(x, y * 1.25))else:
    y = int(min(y, x * 1.25))
x1, y1 = min(int(y * 1.25), h), min(int(x * 1.25), w)
if x * y1 > y * x1:
    print(x, y1)else:
    print(x1, y)
