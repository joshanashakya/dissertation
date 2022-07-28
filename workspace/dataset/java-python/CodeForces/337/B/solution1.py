from fractions import Fractiona, b, c, d = map(int, input().split())v = Fraction(abs(a * d - b * c), max(a * d, b * c))print(v.numerator, '/', v.denominator, sep='')
