n = int(input())
for _ in range(n):
    a = int(input())
    if (a < 31):
        print("NO")
    else:
        k = a - 30
        if k != 6 and k != 14 and k != 10:
            print("YES")
            print("6 10 14", a - 30)
        else:
            print("YES")
            print("6 10 15", a - 31)
