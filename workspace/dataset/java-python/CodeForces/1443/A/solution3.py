import sys input = sys.stdin.buffer.readlinet = int(input()) for _ in range(t):    n = int(input())     print(
    " ".join(list(map(str, list(range(2 * n + 2, 4 * n + 1, 2))))))  # print(*range(2 * n + 2, 4 * n + 1, 2))
