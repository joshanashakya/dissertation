import sys def main():    inp = sys.stdin.read().strip().split('\n')    return (i for i in inp[1].split() if i in set(inp[2].split()))    print(*main())
