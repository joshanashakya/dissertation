from sys import maxsize, stdout, stdin, stderrmod = int(1e9 + 7)


def I(): return int(stdin.readline())


def lint(): return [int(x) for x in stdin.readline().split()]


def S(): return input().strip()


def grid(r, c): return [lint() for i in range(r)]


from collections import defaultdictimport

math t = I()
for _ in range(t):    n = I()
b = input()
print("1", end="")
idx = int(b[0]) + 1
for i in range(1, n):        if
b[i] == "0":
if idx != 1:                print("1", end="")
idx = 1 else:                print("0", end="")
idx = 0 else:            if idx != 2:                print("1", end="")
idx = 2 else:                print("0", end="")
idx = 1
print()
