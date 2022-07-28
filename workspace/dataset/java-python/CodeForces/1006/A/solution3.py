# coding: utf-8 n = int(input())a = list(map(int, input().split()))b = [x if x % 2 else x - 1 for x in a] print(*b, sep = ' ')
