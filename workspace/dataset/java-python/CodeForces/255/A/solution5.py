n=int(input())a = list(map(int, input().split()))l = [sum(a[i::3]) for i in [0,1,2] ]print(["chest", "biceps", "back"][l.index(max(l))])
