n = int(input())a = list(map(int, input().split()))lst = [1] * nind = n - 1 - a[-1]val = 0for i in range(n - 1, -1, -1):    if a[i]:        ind = i - a[i]        lst[i] = 1        val += 1        break    else:        lst[i] = 1        val += 1for i in range(n - val - 1, -1, -1):    if i >= ind:        lst[i] = 0    ind = min(ind, i - a[i])cnt = 0for i in range(n):    if lst[i] == 1:        cnt += 1print(cnt)