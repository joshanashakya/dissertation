#1 inpput = int(input())  if inpput >=4:    inpput-=4     bayan = inpput//3    c = inpput%3     print('+------------------------+')     if c>0:        print(  '|'+'O.'+'O.'*(bayan)+'O.'+'#.'*(11-(1+bayan+1))+'|D|)'  )        c-=1    else:        print(  '|'+'O.'+'O.'*(bayan)+'#.'*(11-(1+bayan))+'|D|)'  )     if c>0:        print(  '|'+'O.'+'O.'*(bayan)+'O.'+'#.'*(11-(1+bayan+1))+'|.|'  )        c-=1    else:        print(  '|'+'O.'+'O.'*(bayan)+'#.'*(11-(1+bayan))+'|.|'  )     print('|O.......................|')     if c>0:        print(  '|'+'O.'+'O.'*(bayan)+'O.'+'#.'*(11-(1+bayan+1))+'|.|)'  )        c-=1    else:        print(  '|'+'O.'+'O.'*(bayan)+'#.'*(11-(1+bayan))+'|.|)'  )                              print('+------------------------+') else:     print('+------------------------+')    if inpput>0:        print(  '|'+'O.'+'#.'*(10)+'|D|)'  )        inpput-=1    else:        print(  '|'+'#.'+'#.'*(10)+'|D|)'  )                      if inpput>0:        print(  '|'+'O.'+'#.'*(10)+'|.|'  )        inpput-=1    else:        print(  '|'+'#.'+'#.'*(10)+'|.|'  )             if inpput>0:        print(  '|'+'O.'+'..'*(10)+'..|'  )        inpput-=1    else:        print(  '|'+'#.'+'..'*(10)+'..|'  )              if inpput>0:        print(  '|'+'O.'+'#.'*(10)+'|.|)'  )    else:        print(  '|'+'#.'+'#.'*(10)+'|.|)'  )            print('+------------------------+')	   	 		  					      			 	  			