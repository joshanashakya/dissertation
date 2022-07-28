cases = int(input())while cases:    cases -= 1    n, k = map(int, input().split())     ans = 0     while n:        ans += n % k        n //= k        if n > 0:            ans += 1     print(ans)
