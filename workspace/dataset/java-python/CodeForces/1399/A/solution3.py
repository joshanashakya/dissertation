for s in [*open(0)][2::2]: a = {*map(int, s.split())};print('YNEOS'[len(a) <= max(a) - min(a)::2])
