n, x, y = [int(x) for x in input().split()]s = input()[::-1]c = 0c = sum([1 for i in s[0:y] if i == '1'])c += sum([1 for i in s[y+1:x] if i == '1'])if s[y] == '0' :    c+=1print(c)
