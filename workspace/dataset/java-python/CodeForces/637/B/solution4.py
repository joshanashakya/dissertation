n = int(input())a = [input() for _ in range(n)]s = set()for i in reversed(a):    if i not in s:        s.add(i)        print(i)
