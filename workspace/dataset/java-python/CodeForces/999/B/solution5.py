n = int(input())s = list(input())   for i in range(2 , n):    if n%i==0:        s[:i] = s[:i][::-1]        # print(''.join(s)) print(''.join(reversed(s)))
