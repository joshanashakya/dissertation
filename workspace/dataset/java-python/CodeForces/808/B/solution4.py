n,k = map(int,input().split()) A = list(map(int,input().split())) acc = sum([min(i+1,n-i,n-k+1,k) * A[i] for i in range(n)]) print(acc / (n - k + 1))
