import sys 

def main():    _, *l = map(int, sys.stdin.read().strip().split())


out = []
for i in l:        out.extend((str(i - 1), ' '.join(map(str, range(2, i + 1)))))
return out
print(*main(), sep='\n')
