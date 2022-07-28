import math for _ in range(int(input())):    n = int(input())
a = [int(x) for x in input().split()]
print(' '.join([str(1 << int(math.log2(x))) for x in a]))
