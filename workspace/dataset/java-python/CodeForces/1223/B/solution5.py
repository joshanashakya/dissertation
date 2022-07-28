def solve():  s, t = input(), input()  if len(set(s) & set(t)) > 0:    print('YES')  else:    print('NO') t = int(input())for _ in range(t):  solve()
