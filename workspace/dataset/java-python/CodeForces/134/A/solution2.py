n = int(input())A = list(map(int, input().split()))B = []srar = 0  for i in range(n):    srar += A[i]srar = srar/n   for i in range(n):    if ((srar * n) - A[i]) / (n-1) == A[i]:        B.append(i+1)                print(len(B))for i in range(len(B)):    print(B[i], end = ' ')
