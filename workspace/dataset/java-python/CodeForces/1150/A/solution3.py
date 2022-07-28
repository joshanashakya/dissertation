N, M, R = map(int, input().split())S = list(map(int, input().split()))B = list(map(int, input().split()))ms = min(S)mb = max(B)print(max(mb*(R//ms) + R%ms, R))
