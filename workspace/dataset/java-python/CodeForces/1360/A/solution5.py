n = int(input()) for _ in range(n):    side_length = list(map(int, input().split()))        print(max(min(side_length) * 2, max(side_length)) ** 2)
