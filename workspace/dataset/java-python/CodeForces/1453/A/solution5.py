for _ in range(int(input())):    map(int, input().split())
print(len(set(map(int, input().split())).intersection(set(map(int, input().split())))))
