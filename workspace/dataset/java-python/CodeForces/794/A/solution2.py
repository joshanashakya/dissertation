a, b, c = map(int, input().split())num = int(input())arr = list(map(int, input().split())) ct = 0for n in arr:    if b < n < c:        ct += 1 print(ct)
