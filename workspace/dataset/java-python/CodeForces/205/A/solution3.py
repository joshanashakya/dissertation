n = int(input())a = list(map(int, input().split()))x = min(a)if a.count(x)>1:    print('Still Rozdil')else:    print(a.index(x)+1)
