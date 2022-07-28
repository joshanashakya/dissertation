for _ in range(int(input())):    n, k = map(int, input().split())
p = list(map(int, input().split()))
res = k / 100
count = 0
sm = p[0]
for i in range(1, n):        sol = 100 * p[i]
if sol % k == 0:
    sol = sol // k        else:
    sol = sol // k + 1  # print(sm, sol)        if sm<sol:            temp = abs(sm -sol)            sm = sm + temp            count+=temp        sm+=p[i]        print(count)
