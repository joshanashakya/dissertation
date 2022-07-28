import sys def main():    s = sys.stdin.read().strip()    if s in {'a1', 'a8', 'h1', 'h8'}: return 3    if any(i in s for i in '18ah'): return 5    return 8 print(main())
