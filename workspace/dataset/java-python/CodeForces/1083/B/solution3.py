n, k = map(int, input().split())a = input()b = input()res = 0ans = 0for i in range(0, n):    res = min(res * 2 + (b[i] == 'b') - (a[i] == 'b'), k)    ans += min(res + 1, k)print(ans)
