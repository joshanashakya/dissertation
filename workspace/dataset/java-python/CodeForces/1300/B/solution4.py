import sys input = sys.stdin.buffer.readline t = int(input())for _ in range(t):    n = int(input())    A = sorted(map(int, input().split()))    print(A[n] - A[n - 1])
