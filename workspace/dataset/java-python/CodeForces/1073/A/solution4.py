import sysinput = sys.stdin.readline n = int(input())  s = input()for i in range(n - 1):    if s[i] != s[i + 1]:        print("YES")        print(s[i], s[i + 1], sep = "")        exit()print("NO")
