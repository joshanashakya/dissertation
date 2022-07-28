n = int(input())permutation = []for _ in range(n):    S = set(input().split())    permutation.append(len(S) - 1)permutation[permutation.index(n - 1)] = nprint(*permutation)
