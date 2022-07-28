import sys def main():    s = sys.stdin.read().strip()    return sum(i in set('aeiou13579') for i in s)        print(main())
