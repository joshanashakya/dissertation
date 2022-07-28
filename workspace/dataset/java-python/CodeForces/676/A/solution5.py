n = int(input())lst = [int(i) for i in input().split()]mn = lst.index(min(lst))mx = lst.index(max(lst)) print(max(mn, n - mn - 1, mx, n - mx - 1))
