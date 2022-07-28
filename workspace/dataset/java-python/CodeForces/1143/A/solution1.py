import sys def main():    _, s = sys.stdin.read().strip().split('\n')    t = s.replace(' ', '').rstrip(s[-1])    return len(t)    print(main())
