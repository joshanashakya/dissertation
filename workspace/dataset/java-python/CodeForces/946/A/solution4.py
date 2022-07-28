import sys def main():    return sum(abs(int(i)) for i in sys.stdin.read().strip().split()[1:]) print(main())
