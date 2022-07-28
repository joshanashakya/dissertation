N = int(input())one = input().count('1')two = N - oneif not one or not two:    ans = [1] * one + [2] * twoelse:    ans = [2, 1] + [2] * (two - 1) + [1] * (one - 1)print(*ans)
