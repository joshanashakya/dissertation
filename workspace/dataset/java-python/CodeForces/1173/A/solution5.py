a=[int(i) for i in input().split()]x=a[0]y=a[1]z=a[2]if y==x and z==0:    print('0')elif x>y+z:    print('+')elif y>x+z:    print('-')else:    print('?')
