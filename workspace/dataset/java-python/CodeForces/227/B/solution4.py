n = int(input())lst = input().split()index_to_val = {lst[idx]:idx+1 for idx in range(n)}input()x=y=0for q in input().split():    x += index_to_val[q]    y += n - index_to_val[q] + 1print(x,y)
