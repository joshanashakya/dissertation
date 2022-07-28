import sys def main():    n = int(sys.stdin.read().strip())    return [('D'*i).center(n, '*') for i in list(range(1, n+1, 2)) + list(range(n-2, 0, -2))] print(*main(), sep='\n')
