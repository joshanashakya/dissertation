n = int(input())s = list(map(int, input().split()))a = sorted(s, reverse=True)sum_a = sum([a[x] * x + 1 for x in range(0, n)])print(sum_a)i = 0while i < n:    print(s.index(a[i]) + 1, end=" ")    s[s.index(a[i])] = 0    i += 1
