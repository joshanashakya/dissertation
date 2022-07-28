def solve(n):    if


    (n <= 2):
return "NO" elif (n & (n - 1) == 0):
return "NO" else:        return "YES"
for i in range(int(input())):    print(solve(int(input())))
