cases = int(input())while cases:    cases -= 1    x = int(input())    arrx = list(map(int, input().split()))    y = int(input())    arry = list(map(int, input().split()))     ans = sum(1 for i in arrx if i % 2 == 0) * sum(1 for i in arry if i % 2 == 0) + sum(1 for i in arrx if i % 2 != 0) * sum(1 for i in arry if i % 2 != 0)    print(ans)
