a = int(input())x = [str(x) for x in str(input()[:a])]z = x.count('z')e = x.count('e')r = x.count('r')o = x.count('o')n = x.count('n')print(*[n*'1 '+r*'0 '])
