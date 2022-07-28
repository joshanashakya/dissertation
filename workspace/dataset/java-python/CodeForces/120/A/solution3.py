a=open("input.txt","r").read().split()f=open("output.txt","w")if a[0][0]=="f" and a[1]=="1" or a[0][0]=="b" and a[1]=="2":    f.write("L")else:    f.write("R")f.close()
