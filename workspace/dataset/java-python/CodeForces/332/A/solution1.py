n = int(input())s = input()c = 0 for i in range(n,len(s),n):    tmp = s[i-3:i]     if 'a'in tmp and 'b' in tmp :        continue    c+=1print(c)
