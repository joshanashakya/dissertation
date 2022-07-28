import sys def main():    n = int(sys.stdin.read().strip())    for i in range(9, 0, -1):        if not n%i:            return n//i, (n//i*f'{i} ').strip() print(*main(), sep='\n')
