s = input()n=len(s)ans = s[-1]for i in range(n - 2, -1, -1):    if s[i] >= ans[-1]:        ans += s[i]print(ans[::-1])
