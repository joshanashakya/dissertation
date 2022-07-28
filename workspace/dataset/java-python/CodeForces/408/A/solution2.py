n = int(input())fodac = input()val = 100000for i in range(n):    val = min(val, sum(int(x) * 5 + 15 for x in input().split()))print(val)
