import sys def main():    inp = sys.stdin.read().strip().split('\n')[1]    s = [len(x) for x in inp.split('W') if x]    return [len(s), ' '.join(map(str, s))]    print(*main(), sep='\n')
