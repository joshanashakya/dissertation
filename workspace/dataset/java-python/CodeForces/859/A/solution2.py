K = int(input())T = list(map(int, input().split()))T.sort()if T[-1] <= 25:    print('0')else:    print(T[-1]-25)
