n = int(input())lst = [int(i) for i in input().split()]print(max((2*sum(lst) + n)//n, max(lst)))
