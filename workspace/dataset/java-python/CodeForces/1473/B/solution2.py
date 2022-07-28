import math testCases = int(input()) for i in range(testCases):    stringA = input()
stringB = input()
a = len(stringA)
b = len(stringB)
LCM = a * b // math.gcd(a, b)
stringAlcm = stringA * (LCM // a)
stringBlcm = stringB * (LCM // b)
if stringAlcm == stringBlcm:
    print(stringAlcm)    else:
    print(-1)
