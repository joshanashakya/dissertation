n,k = map(int,input().split(" "))s = input()l = []for i in range(k):    l.append(s.count(chr(i+ord("A"))))print(min(l)*k)
