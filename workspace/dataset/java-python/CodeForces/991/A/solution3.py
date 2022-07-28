A, B, C, N = map(int, input().split())A -= CB -= CS = A + B + Cif S < N and A + C >= C and B + C >= C:    print(N - S)else:    print(-1)
