cases = int(input()) one = 0two = 0broken = Falsewhile cases:    cases -= 1    a, b = map(int, input().split())     if a < 0:        one += 1    if a > 0:        two += 1    if min(two, one) > 1:        broken = True        print("No")        break if not broken:    print("Yes")
