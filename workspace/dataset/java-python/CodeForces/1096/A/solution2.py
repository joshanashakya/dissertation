test_cases = int(input()) for i in range(test_cases):    l, r = map(int, input().split())     rem = r % l    if rem == 0:        print(l, r)    else:        print(l, r - rem)
