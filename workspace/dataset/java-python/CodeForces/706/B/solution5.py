import bisect input()x=sorted(map(int, input().split())) for i in range(int(input())):    print(bisect.bisect(x, int(input())))              
