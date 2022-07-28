T = int(input())
for i in range(1, T + 1):    arr = [int(s) for s in input().split()]
if sum(arr) % 9 == 0 and sum(arr) <= 9 * min(arr):
    print('YES')    else:
    print('NO')
