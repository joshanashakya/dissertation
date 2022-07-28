import sys def main():    _, k, *l = sys.stdin.read().strip().split()    return sum(sum(i in '47' for i in s) <= int(k) for s in l)    print(main())
