from sys import stdininput = stdin.readline t = int(input())for _ in range(t):    n, m = [int(x) for x in input().split()]    print(["NO", "YES"][n % m == 0])
