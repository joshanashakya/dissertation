s=input().split()s1=s[0][1:]print(s[0][0],end="")for i in s1:    if(ord(i)>=ord(s[1][0])):        print(s[1][0],end="")        break    else:        print(i,end="")        else:    print(s[1][0],end="")
