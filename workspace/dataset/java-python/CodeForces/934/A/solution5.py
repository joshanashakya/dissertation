n,m = map(int, input().split())A = list(map(int, input().split()))B = list(map(int, input().split())) ans1 = float('inf')for i in range(n):    ans2 = -float('inf')    for j in range(n):        if j == i:            continue        for k in range(m):            ans2 = max(ans2, A[j]*B[k])    ans1 = min(ans1, ans2)print(ans1)
