n = int(input())a = int(input())b = int(input())c = int(input())x = min(a, b)y = min(a, b, c)print(0 if n==1 else x + y*(n-2))
