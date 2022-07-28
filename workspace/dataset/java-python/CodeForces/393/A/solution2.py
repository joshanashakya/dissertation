word = input()n = word.count('n')i = word.count('i')e = word.count('e')t = word.count('t') if(n<3):    print(0)else:    print(min((n-1)//2,i,e//3,t))
