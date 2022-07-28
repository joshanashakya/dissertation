x = int(input())s = input()N = 0for i in range(x-1):    if s[i] != s[i + 1]:        print("YES")        print(s[i] + s[i + 1])        N = 1        breakif N == 0:    print("NO")
