t = int(input())for _ in range(int(t)):    n = int(input())    s = input()    a = int(s[0])    b = int(s[1:])    if a < b:        print("YES")        print(2)        print(a, b)    else:        print("NO")