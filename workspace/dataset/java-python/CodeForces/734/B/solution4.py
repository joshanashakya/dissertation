import sysinput = sys.stdin.readline ''' '''  k2, k3, k5, k6 = map(int, input().split())num_256 = min(k2, min(k5, k6))k2 -= num_256num_32 = min(k2, k3)print(num_256 * 256 + num_32 * 32)
