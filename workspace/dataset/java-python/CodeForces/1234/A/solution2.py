import mathfor t in range(int(input())):    n = int(input())    a = list(map(int, input().split()))    print(math.ceil(sum(a)/n))
