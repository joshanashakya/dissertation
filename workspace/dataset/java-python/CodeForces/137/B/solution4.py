n = int(input()) seq = [int(i) for i in input().split()] l_n = [i for i in seq if i <= n]ans = n - len(set(l_n)) print(ans)
