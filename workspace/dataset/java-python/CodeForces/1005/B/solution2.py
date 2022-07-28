s1 = list(input())s2 = list(input()) while s1 and s2:    if s1[-1] == s2[-1]:        s1.pop()        s2.pop()    else:        break print(len(s1) + len(s2))   
