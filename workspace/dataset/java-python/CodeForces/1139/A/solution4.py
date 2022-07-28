import sys def main():    _, s = sys.stdin.read().strip().split()    return sum(i+1 for i,j in enumerate(map(int, s)) if not j%2)    print(main())
