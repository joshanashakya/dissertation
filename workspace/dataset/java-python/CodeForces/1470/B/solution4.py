from sys import stdin, stdoutfrom

collections
import defaultdictimport

mathimport
os, sys, __pypy__  

def get_prime(n):    n = int(math.sqrt(n))


prime = [2]
for x in range(3, n + 1, 2):        is_prime = False
for p in prime:            if
p > int(math.sqrt(x)): is_prime = True
break
if x % p == 0:                break
if is_prime:            prime.append(x)
return prime  

def main():    t = int(stdin.readline())


ans = __pypy__.builders.StringBuilder()
prime = get_prime(1000000)
for _ in range(t):        n = int(stdin.readline())
arr = list(map(int, stdin.readline().split()))
gp = defaultdict(int)
mx = -1
for a in arr:            x = a
uniq_p = []
for p in prime:                while
x % p == 0:
if len(uniq_p) > 0 and uniq_p[-1] == p:
    uniq_p.pop()                    else:
    uniq_p.append(p)
x = int(x / p)
if p > x:                    break
if x != 1:                uniq_p.append(x)
key = 1
for x in uniq_p:                key *= x
gp[key] += 1
mx = max(mx, gp[key])
mx_2 = 0
for k, v in gp.items():            if
v % 2 == 0 or k == 1: mx_2 += v
q = int(stdin.readline())
for _ in range(q):            qq = int(stdin.readline())
if qq == 0:
    ans.append("%d\n" % (mx))            else:
    ans.append("%d\n" % (max(mx, mx_2)))
os.write(1, ans.build().encode())   main()
