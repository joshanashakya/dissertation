x = (int(input()))x = abs(x) ans = 0cur = 0while (cur < x or ((x-cur)%2 != 0)):    ans += 1    cur += ans print(ans)
