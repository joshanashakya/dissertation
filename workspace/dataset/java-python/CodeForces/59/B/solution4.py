n = int(input())
b = [int(i) for i in input().split()]
odd = list(filter(lambda x: x % 2 == 1, b)) if sum(b) % 2 == 1:
    print(sum(b))else:
    print(sum(b) - min(odd) if odd else 0)
