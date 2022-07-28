L=input()  s1=L.count("x")s2=L.count("y")x=max(s1,s2)v=abs(s1-s2)if x==L.count("x"):    print("x"*v)else:    print("y"*v)
