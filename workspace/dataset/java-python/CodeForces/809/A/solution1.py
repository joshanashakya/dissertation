MOD = int(1e9 + 7)n = int(input())arr = list(map(int, input().split()))arr.sort()l = 1; r = 0for i in range(n):    r = (r + l * arr[i]) % MOD    l = l * 2 % MODl = 1for i in range(n - 1, -1, -1):    r = (r - l * arr[i]) % MOD    l = l * 2 % MODprint(r)