n = int(input())A = list(map(int, input().split())) import mathk = 0ans = []import mathfor i in range(n-1):    if math.gcd(A[i], A[i+1]) != 1:        ans.append(A[i])        ans.append(1)        k += 1    else:        ans.append(A[i])else:    ans.append(A[n-1])print(k)print(*ans)