import sys def main():    inp = sys.stdin.read().strip().split('\n')    out = []    for s in inp[1:]:        s, a, b, c = map(int, s.split())        out.append(s//c + s//c//a*b)    return out    print(*main(), sep='\n')
