import mathimport sys n,h=map(int,input().split()) for i in range(1,n):    new_h=(h*h*i/n)**0.5    print("%.12f"%(new_h)) 
