s=input()k=int(input()) ss=set(s.strip()) ns=len(ss) if k>len(s):    print("impossible")else:    print(max(0,k-ns)) 
