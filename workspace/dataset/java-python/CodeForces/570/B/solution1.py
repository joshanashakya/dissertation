n, m = map(int, input().split())if n == 1:    print(1)else:    print(m-1 if m-1 >= n-m  else m+1)
