for _ in range(int(input())):    n, k = map(int, input().split())    a = [1]*(k-1)+[(n-k+1)]    if a[-1]%2==1 and a[-1]>0:        print("YES")        print(*a)        continue    a = [2]*(k-1)+[n-2*(k-1)]    if a[-1]%2==0 and a[-1]>0:        print("YES")        print(*a)        continue        print("NO")    