# coding: utf-8 for ct in range(int(input())):  n, m = map(int, input().split())  bottom = set(map(int, input().split()))  end = set(map(int, input().split()))    print(len(bottom.intersection(end)))
