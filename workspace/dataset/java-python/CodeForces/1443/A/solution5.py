import sys 

def main():    _, *l = map(int, sys.stdin.read().strip().split())


out = []
for n in l:        out.append(' '.join(map(str, range(4 * n, 2 * n, -2))))
return out
print(*main(), sep='\n')
