for t in range(int(input())):    n = int(input())    ans = 0    while n >= 10:        ans += (10*(n//10))        n = n - (9 * (n//10))    ans += n    print(ans)
