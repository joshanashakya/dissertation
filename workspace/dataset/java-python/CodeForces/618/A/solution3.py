n = int(input())ans = []i = 1while n > 0:    if n & 1:        ans.insert(0, i)    n //= 2    i += 1print(*ans)
