s = input()h = int(s[:2])m = int(s[3:])while True:    m+=1    h+=m//60    m=m%60    h=h%24    if h//10==m%10 and m//10==h%10:        breakprint(h//10,h%10,':',m//10,m%10,sep='')
