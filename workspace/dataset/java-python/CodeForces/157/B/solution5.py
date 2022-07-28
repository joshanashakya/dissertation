import math n = int(input()) a = [int(x) for x in input().split()]a.sort(reverse = True) area = 0mult = 1 for i in range(0,n):    area += mult*(a[i]**2)    mult *= -1 print(area*math.pi)
