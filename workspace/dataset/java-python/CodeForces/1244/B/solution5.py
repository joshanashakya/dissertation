t = int(input()) def solve():    n = int(input())    s = input()     if all(map(lambda x: x == '0', s)): return n    if all(map(lambda x: x == '1', s)): return n*2     a=b=None    for i in range(n):        if s[i] == '1' and a is None: a=i        if s[i] == '1': b = i #    print(a, b, 'test')    return max((b+1)*2, (n-a)*2)  for _ in range(t): print(solve())
