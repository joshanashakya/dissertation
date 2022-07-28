for s in [*open(0)][2::2]: s = s.split();print([1, len(s)][len({*s}) < 2])
