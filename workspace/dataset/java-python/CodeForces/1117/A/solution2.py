input()A = list(map(int, input().split()))x = max(A)m = k = 0 for a in A:    if a == x:        k += 1        m = max(m, k)    else:        k = 0 print(m)
