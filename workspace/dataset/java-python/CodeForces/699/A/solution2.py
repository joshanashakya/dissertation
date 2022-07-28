n = int(input())s = input()a = list(map(int, input().split()))t = 10 ** 10for i in range(n - 1):  if s[i:i+2] == 'RL':    t = min(t, (a[i + 1] - a[i]) // 2)if t == 10 ** 10:  print(-1)else:  print(t)
