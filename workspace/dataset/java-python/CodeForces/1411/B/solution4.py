from sys import stdin, stdoutimport

math, bisectfrom
collections
import Counter, deque, defaultdictL = lambda: list(map(int, stdin.readline().strip().split()))
M = lambda: map(int, stdin.readline().strip().split())
I = lambda: int(stdin.readline().strip())
S = lambda: stdin.readline().strip()
C = lambda: stdin.readline().strip().split()


def pr(a): return ("".join(list(map(str,
                                    a))))  # _________________________________________________# def check(n):    t = n    while n:        x = n%10        if x!=0:            if t%x:                return 0        n=n//10    return 1 def solve():    n = I()    while not check(n):        n+=1    print(n)    for _ in range(I()):    solve() 
