import mathfor

_ in range(int(input())): s1 = input()
s2 = input()
g = math.gcd(len(s1), len(s2))
if (len(s2) // g * s1 == len(s1) // g * s2):
    print(len(s2) // g * s1)    else:
    print(-1)
