n = int(input())li = []for i in range(n):    A, B, C, D = map(int, input().split())    sum_1 = A + B + C + D    li.append(sum_1) a = li[0]li.sort(reverse=True)print(li.index(a) + 1)
