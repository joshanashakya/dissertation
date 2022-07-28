n = int(input())a = tuple(map(int, input().split()))x, y = abs(a[0] - 1), abs(a[0] + 1)for i in a[1:]:    x, y =  min(x + abs(i - 1), y + abs(i + 1)), min(y + abs(i - 1), x + abs(i + 1))print(x)
