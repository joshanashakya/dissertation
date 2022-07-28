# coding: utf-8 n, m = map(int, input().split())a = list((x - 1) // m for x in map(int, input().split()))[::-1]print(n - a.index(max(a)))
