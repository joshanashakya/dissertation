n, k = map(int, input().split(' '))print(k**(k-1)*(n-k)**(n-k)%int(1e9+7))
