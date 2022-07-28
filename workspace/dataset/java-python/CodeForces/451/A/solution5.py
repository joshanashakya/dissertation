k=0n=input()a=list(n.split())if int(a[0])>int(a[1]):    k=int(a[1])elif int(a[1])>int(a[0]):    k=int(a[0])else:    k=int(a[0])if k%2==0:    print("Malvika")else:    print("Akshat")
