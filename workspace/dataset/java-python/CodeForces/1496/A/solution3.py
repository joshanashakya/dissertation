I = input
exec(int(I()) * "n,k=map(int,I().split());s=I();i=0\nwhile i<k and s[i]==s[~i]:i+=1\nprint('NYOE S'[n>2*k<=2*i::2])\n")
