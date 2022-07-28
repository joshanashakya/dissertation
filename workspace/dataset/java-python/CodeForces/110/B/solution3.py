n = int(input())s = "abcd"for i in range(n//4):    print(s, end = "")print(s[:n%4], end = "")
