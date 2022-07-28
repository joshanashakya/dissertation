n, k = map(int, input().split())s = input()t = input()res = 0ans = 0for i in range(0, n):    res = min(res * 2 - (s[i] == 'b') + (t[i] == 'b'), k);    ans += min(res + 1, k)print(ans)
