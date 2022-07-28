n, m = map(int, input().split())A = list(map(int, input().split()))L = [0]*nfor i in range(m):    L[A[i]-1] += 1print(min(L))
