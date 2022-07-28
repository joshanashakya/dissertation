cases = int(input())while cases:    cases -= 1    a, b, n = map(int, input().split())     ans = [a, b, a^b]     print(ans[n%3])
