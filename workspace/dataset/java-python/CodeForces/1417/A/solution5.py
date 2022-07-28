import sys 

def main():    inp = sys.stdin.read().strip().split('\n')


out = []
for i in range(1, len(inp), 2):        _, k = map(int, inp[i].split())
l = [int(x) for x in inp[i + 1].split()]
m = min(l)
out.append(sum((k - x) // m for x in l if x < k) - (k - m) // m)
return out print(*main(), sep='\n')
