n = int(input())s = input()r = lambda : list(map(int, input().split()))arr = r()  f = Truevisited = set()pos = 0while 1:    if pos < 0 or pos >= n: break     if pos in visited:        f = False        break     visited.add(pos)    if s[pos] == '>':        pos += arr[pos]    else:        pos -= arr[pos]  print("FINITE" if f else "INFINITE")  