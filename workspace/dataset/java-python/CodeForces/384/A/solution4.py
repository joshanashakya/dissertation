import sysfrom math import ceil def main():    n = int(sys.stdin.read().strip())    t = int(ceil(n/2))    return t*n - n%t, '\n'.join(''.join('.C'[not (i+j)%2] for j in range(n)) for i in range(n))        print(*main(), sep='\n')