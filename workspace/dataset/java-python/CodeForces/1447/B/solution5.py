def solve():  pass

 t = int(input())
for _ in range(t):  n, m = map(int, input().split())
cnt_negative, min_value, sm = 0, 100, 0
for i in range(n):    for
x in map(int, input().split()): min_value = min(min_value, abs(x))
sm += abs(x)
if x < 0:        cnt_negative += 1
if cnt_negative % 2 == 0:
    print(sm)  else:
    print(sm - 2 * min_value)
