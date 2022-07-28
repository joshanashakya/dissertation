import sys, io, os, mathfrom

math
import ceil, log, gcd, sqrtfrom

itertools
import permutationsimport

operatormod = 1000000007
mod1 = 998244353


def intinp():    return int(sys.stdin.readline())


def strinp():    return sys.stdin.readline()


def arrinp():    return list(map(int, sys.stdin.readline().strip().split()))


def mulinp():    return map(int, sys.stdin.readline().strip().split())


def flush():    return stdout.flush()


def power_two(x):    return (1 << x)


def lcm(a, b):    return a * b // gcd(a, b)

 

def solve():    n, k = mulinp()


t = arrinp()
res = 0
t.sort()
for i in range(1, n):        res = gcd(res, t[i] - t[0])
if ((k - t[0]) % res):        print('NO')
return print('YES') 

def main():    tc = intinp()  # tc=1	while(tc):		solve()		tc-=1	main() 
