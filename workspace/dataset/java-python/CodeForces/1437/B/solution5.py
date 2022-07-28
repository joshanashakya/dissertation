for _ in range(int(input())):    n = int(input())
s = input()
print(n // 2 - max(s.count('10'), s.count('01')))
