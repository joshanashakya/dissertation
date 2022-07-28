n = int(input() )a = list(map(int, input().split() ) )for i in range(n):    a[i] = [a[i], i+1]a = sorted(a)for i in range(n//2):    print(a[i][1], a[n-1-i][1] ) 
