n, d = list(map(int, input().split()))s = list(map(int, input().split()))t = 2for i in range(n-1):    if s[i+1] - s[i] == 2*d:        t += 1    if s[i+1] - s[i] > 2*d:        t += 2print(t)
