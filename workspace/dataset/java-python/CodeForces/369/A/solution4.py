n, m, k = list(map(int, input().split()))ans = 0a = list(map(int,input().split()))a.sort()for i in range(len(a)):    if (a[i] == 1):        m -= 1        a[i] = 0    if (m <= 0):        breakfor i in range(len(a)):    if (k <= 0 and  m <= 0):        break    if (a[i] != 0):        if (a[i] == 2):            if (m >= 1):                m -= 1                a[i] = 0            else:                k -= 1                a[i] = 0    # print(a)for i in range(len(a)):    if (a[i] != 0):        ans += 1print(ans)
