n = int(input())T = list(map(int, input().split()))one = T.count(1)two = T.count(2)if one == 0 or two == 0:    print(one//3)elif one <= two:    print(one)else:    print(two+(one-two)//3)
