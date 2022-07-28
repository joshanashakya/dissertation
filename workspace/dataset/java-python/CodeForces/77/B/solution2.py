t = int(input())
for _ in range(t):    a, b = map(float, input().split())
if b == 0.0:
    print(1.0)    elif a == 0.0:
    print(0.5)     elif a / 4.0 <= b:
    print((a + 8.0 * b) / 16.0 / b)    else:
    print(1.0 - b / a)
