n = int(input())d = [int(item) for item in input().split()]s, t = [int(item) for item in input().split()]ss = min(s, t)-1tt = max(s, t)-1dist1 = sum(d[ss:tt]) print(min(sum(d)-dist1, dist1))
