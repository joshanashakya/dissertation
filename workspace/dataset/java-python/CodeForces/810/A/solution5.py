n, k = map(int, input().split())a = list(map(int, input().split()))  i = 0avg = round(sum(a)/n, 10) while avg < k - 0.5:    i += 1    avg = round((sum(a) + i*k) / (n+i), 10)     print(i) 
