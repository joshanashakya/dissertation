import mathn, d = map (int, input(). split())a = list (map (int, input(). split()))answer = 0for i in range (1, len(a)):    if (a[i] <= a[i - 1]):        t = math. ceil ((a[i - 1] - a[i] + 1) / d)        answer += t        a[i] += t * dprint (answer)
