import sys def main():    n = int(sys.stdin.read().strip())    t = n//2    if n%2: return t, t + 1    return t - 1 - t%2, t + 1 + t%2    print(*main())
