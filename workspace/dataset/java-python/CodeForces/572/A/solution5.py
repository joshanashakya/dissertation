x = input()k, m = map(int, input().split())daf1 = list(map(int, input().split()))daf2 = list(map(int, input().split()))if daf1[k-1] < daf2[-m]:    print('YES')else:    print('NO')
