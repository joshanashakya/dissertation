no_of_cats,no_of_cats_left = map(int,input().split())  l = []  if(no_of_cats_left==0):    print(1)elif(no_of_cats%2 == 0):    if(no_of_cats//2 == no_of_cats_left):        print(no_of_cats_left)    elif(no_of_cats_left < no_of_cats//2):        print(no_of_cats_left)    else:        print(no_of_cats - no_of_cats_left)else:    if(no_of_cats_left <= no_of_cats//2):        print(no_of_cats_left)    else:        print(no_of_cats - no_of_cats_left)    