from sys import stdinn, k = map(int, stdin.readline().split())ans = 0a = []for i in range(n):    val = int(stdin.readline())    a.append(val)s = set(a)for i in s:    if a.count(i) % 2 != 0:        ans += 1print(n- ans//2)