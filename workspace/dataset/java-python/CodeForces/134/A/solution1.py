n = int(input())a = [int(c) for c in input().split()]k = sum(a) / len(a)b = []for i in range(len(a)):    if a[i] == k:        b.append(i+1)print(len(b))print(*b)
