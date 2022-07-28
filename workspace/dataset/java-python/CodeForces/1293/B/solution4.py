import sys n = int(sys.stdin.readline()) sigma = 0total = n while total:  sigma += (1 / total)  total -= 1print(sigma)
