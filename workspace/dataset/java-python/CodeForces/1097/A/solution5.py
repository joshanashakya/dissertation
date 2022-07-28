s = input()l = list(map(str,input().split()))x = s[0]y = s[1]for i in range(len(l)):    if (l[i][0] == x) or (l[i][1] == y):       print("YES")       breakelse:    print("NO")
