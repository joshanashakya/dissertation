x=int(input())cnt=0l=[]while x!=(2**x.bit_length()-1):  if cnt%2:    x+=1  else:    x^=2**x.bit_length()-1    l.append(x.bit_length())  cnt+=1print(cnt)print(*l)
