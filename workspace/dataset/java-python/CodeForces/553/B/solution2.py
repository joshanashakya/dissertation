n, m = [int(x) for x in input().split()]F = [1,1]for i in range(2, n): F.append(F[-1] + F[-2])perm = [i+1 for i in range(n)]for i in range(n):    if m > F[n-1 - i]:        m -= F[n-1 -i]        perm[i], perm[i+1] = perm[i+1], perm[i]for k in perm: print(k, end = ' ')    # Made By Mostafa_Khaled