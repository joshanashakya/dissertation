import sys 

def main():    inp = sys.stdin.read().strip().split('\n')


out = []
for s in inp[1:]:        n, m, r, c = map(int, s.split())
out.append(max(n - r, r - 1) + max(m - c, c - 1))
return out
print(*main(), sep='\n')
