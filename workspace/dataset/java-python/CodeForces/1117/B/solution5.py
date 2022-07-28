n, m, k = map(int, input().split())a = list(map(int, input().split()))a.sort(reverse = True)p = a[0]*k + a[1]ans = p*(m//(k+1)) + a[0]*(m%(k+1))print(ans)
