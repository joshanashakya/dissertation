import sysfrom collections import defaultdict def main():    _, *inp = map(int, sys.stdin.read().strip().split())    d = defaultdict(set)    for i,j in enumerate(inp, 1):        d[j].add(i)    out = []    n = max(inp) + min(inp)    for i in inp:        if d[i]:             x, y = d[i].pop(), d[n-i].pop()            out.append(f'{x} {y}')    return out print(*main(), sep='\n')
