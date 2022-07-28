a= input()b= a.count('n')c= a.count('i')d= a.count('e')e= a.count('t') if b >4:    print(min((b-1)//2,c,d//3,e))elif b==3 or b== 4:    print(min(1,c,d//3,e))else:    print(0)
