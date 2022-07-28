t = int(input())
for _ in range(t):
    n = int(input())
    if (n <= 30):
        print("NO")
    else:
        print("YES")
        # print(6,10,14,n-30)
        q = n - 30
        if (q == 6 or q == 10 or q == 14):
            print(6, 10, 15, q - 1)
        else:
            print(6, 10, 14, q)
