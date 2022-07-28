l = list(map(int, input().split()))
x = min(l[:4])
if x > l[5]:
    print(l[5] - l[4] + 1)elif x >= l[4]:
    print(x - l[4])else:
    print("0")
