for _ in range(int(input())):    n, A = int(input()), sorted((int(_) for _ in input().split()))    print(next((i for i, a in enumerate(A[::-1]) if i >= a), n))
