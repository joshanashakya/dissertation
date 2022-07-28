for s in [*open(0)][1:]: p, a, b, c = map(int, s.split());print(-max(-p // a * a, -p // b * b, -p // c * c) - p)
