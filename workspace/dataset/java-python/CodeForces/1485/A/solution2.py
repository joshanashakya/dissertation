T = int(input())
for _ in range(T):
    A, B = map(int, input().split());
    C = 0;
    M = 2e9
    if B == 1: B += 1;C += 1
    for i in range(9):
        m = 1;
        L = 0
        while m <= A: m *= B;L += 1
        M = min(M, L + C);
        B += 1;
        C += 1
    print(M)
