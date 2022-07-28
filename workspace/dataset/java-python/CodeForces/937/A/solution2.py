import sys def main():    _, s = sys.stdin.read().strip().split('\n')    return len(set(s.split()) - {'0'})    print(main())
