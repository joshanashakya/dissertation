for i in range(int(input())):    n, a, b = map(int,input().split())    s1 = 'qwertyuiopasdfghjklzxcvbnm'    s2 = s1[:b]    s3 = s2*(n//b)+s2[:n%b]    print(s3)
