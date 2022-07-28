n,m = map(int,input().split())s = list(map(str,input().split()))t = list(map(str,input().split()))for _ in range(int(input())):	y = int(input())	print(s[(y%n)-1]+t[(y%m)-1])
