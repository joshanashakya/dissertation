from sys import stdinn = int(stdin.readline())a = list(map(int, stdin.readline().split()))a = [i-1 for i in a]ans = 0pos = 0while pos < n:    ans += 1    mx_val = pos    while pos < n and pos <= mx_val:        mx_val = max(mx_val, a[pos])        pos += 1 print(ans)