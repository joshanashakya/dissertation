for __ in range(int(input())): n, k = [int(e) for e in input().split()];k -= 1;print(
    (k + n % 2 * k // (n // 2)) % n + 1)
