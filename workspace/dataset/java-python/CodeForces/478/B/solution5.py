n, m = map(int, input().split())kmin = n // mkmax = n - m pairMin = m * kmin * (kmin - 1) // 2 + kmin * (n % m)pairMax = (kmax + 1) * kmax // 2 print(pairMin, pairMax)
