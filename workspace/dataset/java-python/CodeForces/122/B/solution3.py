s = input()s4 = s.count('4')s7 = s.count('7')if s4 == 0 and s7 == 0:	print('-1')elif s4 < s7 :	print ('7')elif s4 > s7 :	print('4')else :	print ('4')
