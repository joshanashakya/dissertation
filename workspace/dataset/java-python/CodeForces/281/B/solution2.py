from fractions import Fraction x, y, n = map(int , input().split()) v = Fraction(x ,y).limit_denominator(n)print(str(v.numerator) + '/' + str(v.denominator))
