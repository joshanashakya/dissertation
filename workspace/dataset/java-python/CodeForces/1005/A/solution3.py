# coding: utf-8 n = int(input())a = list(map(int, input().split())) + [1]stairways = [a[i] for i in range(n) if a[i + 1] == 1] print(len(stairways))print(*stairways, sep = ' ')
