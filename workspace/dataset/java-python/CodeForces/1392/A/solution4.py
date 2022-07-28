for i in range(int(input())):
    n = int(input())
    l = list(map(int, input().split()))
    if (min(l) == max(l)):
        print(n)
    else:
        print(1)
