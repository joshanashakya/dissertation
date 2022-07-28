s=input()n1=s.count('a')n2=s.count('b')n3=s.count('c')n4=s.count('ab')n5=s.count('ba')if (n1==n3  or n2==n3) and n4==1 and n5==0 and s[-n3:].count('c')==n3:	print('YES')else:	print('NO')
