temp = [int(x) for x in input().split()]n = temp[0]m = temp[1]s = input().split()t = input().split()q = int(input())for i in range(q):    y = int(input())    print(s[y%n-1]+t[y%m-1])
