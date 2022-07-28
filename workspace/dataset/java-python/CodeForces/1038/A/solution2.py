n,k = map(int,input().split(" "))s = input()l = []a=0for i in range(k):    # a=i+ord("A") 65.66,67.....    l.append(s.count(chr(i+ord("A"))))print(min(l)*k)
