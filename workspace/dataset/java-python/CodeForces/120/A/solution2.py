f=open('input.txt','r')n1=f.readline()n2=f.readline()n2=int(n2)n1=n1[:n1.index('\n')]g=open('output.txt','w')if n1=='front' and n2==1:    g.write('L')elif n1=='back' and n2==1:    g.write('R')elif n1=='back' and n2==2:    g.write('L')elif n1=='front' and n2==2:    g.write('R')