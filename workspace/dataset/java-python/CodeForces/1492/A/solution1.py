for s in [*open(0)][1:]: p, *a = map(int, s.split());print(min(-p % x for x in a))
