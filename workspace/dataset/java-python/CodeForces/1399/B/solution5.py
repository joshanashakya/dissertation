for _ in range(int(input())):
    n = int(input())
    orange = list(map(int, input().split()))
    candy = list(map(int, input().split()))
    minOrange = min(orange)
    minCandy = min(candy)
    count = 0
    for i in range(n):
        if orange[i] > minOrange or candy[i] > minCandy:
            count += max(orange[i] - minOrange, candy[i] - minCandy)
    print(count)
