t = input()  f=[0]  for j in range(len(t)):     a=bin(ord(t[j]))[2:]     if len(a)<8:        a = '0'*(8-len(a))+a     b=int(a[::-1],2)      x=(f[-1]-b)%256    print(x)    f.append(b)     
