t=int(input())for _ in range(t):    n=int(input())    s=input()    if n==2:        if int(s[0])>=int(s[1]):            print("NO")        else:            print("YES")            print(2)            print(s[0],s[1])    else:        print("YES")        print(2)        print(s[0],s[1:])
