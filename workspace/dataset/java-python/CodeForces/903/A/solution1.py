cases = int(input()) pool = {1, 2, 4, 5, 8, 11} while cases:    cases -= 1    num = int(input())     if num < 3:        print("NO")    else:        step = 0        found = False        while 3*step <= num:            if (num - 3*step) % 7 == 0:                print("YES")                found = True                break            step += 1        if not found:            print("NO")