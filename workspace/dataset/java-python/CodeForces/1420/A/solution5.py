import
    sysinput = sys.stdin.readline   # Ak aspon jeden par je zoradeny: odpoved je YES# Takze plati ze pocet vymien je urcite menej ako n * (n - 1) / 2for test in range(int(input())):    n = int(input())    a = [int(i) for i in input().split()]    mozme = False    for i in range(n - 1):        if a[i] <= a[i + 1]:            mozme = True            break    print("YES" if mozme else "NO")
