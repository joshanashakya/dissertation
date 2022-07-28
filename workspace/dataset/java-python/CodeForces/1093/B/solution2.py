cases = int(input())while cases:    cases -= 1    s = sorted(input())     if s == s[::-1]:        print(-1)    else:        print("".join(s))   
