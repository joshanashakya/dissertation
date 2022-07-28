n = int(input())ks = [int(i) for i in input().split()] mi = 10**9for k in range(n):        mi = min(mi, sum([5*int(i)+15 for i in input().split()]))print(mi)
