cases = int(input()) pool = {1, 2, 4, 5, 8, 11} while cases:    cases -= 1    num = int(input())    if num not in pool:        print("YES")    else:        print("NO")
