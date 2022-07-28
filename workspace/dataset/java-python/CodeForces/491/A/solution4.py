A = int(input())B = int(input())N = A + B + 1i = 0c = [0] * Nwhile i < A:    c[i] = str(i+1)    i+=1c[i] = str(N)i += 1while i < N:    c[i] = str(N - i + A)    i+=1print(" ".join(c))
