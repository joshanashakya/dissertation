import sysfrom

os
import pathif

(path.exists('input.txt') and path.exists('output.txt')): sys.stdout = open('output.txt', 'w')
sys.stdin = open('input.txt',
                 'r')   # list comprehension - l = [s[start:start + 3] for start in range(0, len(s), 3)] def main():    T = int(input())    for ii in range(T):        n, m = (int(i) for i in input().split())        a = []        for i in range(n):            a.append([[int(x) for x in input().split()] for i in range(2)])        ok = False        for i in range(n):            ok |= a[i][0][1] == a[i][1][0]                ok &= m % 2 == 0        print("YES" if ok else "NO")  main()
