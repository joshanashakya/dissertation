MOD = int(1e9) + 7if __name__ == "__main__":    a, b, k = input(), input(), int(input())    x, y = (1, 0) if a == b else (0, 1)    n = len(b)    b += b    same = sum(a == b[i: i + n] for i in range(n))    diff = n - same    for _ in range(k):        x, y = ((x * (same - 1)) % MOD + (y * same) % MOD) % MOD, ((x * (diff)) % MOD + (y * (diff - 1)) % MOD) % MOD    print(x)
