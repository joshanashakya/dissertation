n = int(input())s = set()for i in range(1,int(n**.5)+1):    if n % i == 0:        s.add(i)        s.add(n//i)print(len(s))
