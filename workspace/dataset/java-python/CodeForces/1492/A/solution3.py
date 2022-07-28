for s in [*open(0)][1:]: p, a, b, c = [*map(int, s.split())];print(min(-p % a, -p % b, -p % c))
