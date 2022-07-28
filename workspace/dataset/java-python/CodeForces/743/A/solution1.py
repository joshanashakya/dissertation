n,a,b=map(int,input().split())s=str(input())if s[a-1]==s[b-1]:    print(0)else:    print(abs(int(s[a-1])-int(s[b-1])))
