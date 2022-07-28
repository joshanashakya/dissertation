n = int(input())lst = [int(i) for i in input().split()]exp = sorted(lst, reverse=True) for i in lst:    print(exp.index(i)+1, end=' ')
