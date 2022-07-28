import sys #Este metodo calcula los coeficientes resultantes para n%2==0 y para los restantes calcula los coeficientes de su segunda filadef RestWith4(c,m,n,v):    pos=0    coefi=[1]*n    if v:        for x in range(0,m):            coefi[pos]=c[x]            pos+=1            coefi[pos]=-c[x]            pos+=1    else:        for x in range(0,m):            coefi[pos]=c[x]            pos+=1            coefi[pos]=c[x]            pos+=1    return coefi   #Con este metodo se obtienen los arreglos de los valores factoriales de los numeros desde 0-n asi como su inverso en orden lineal#Para luego calcular la combinatoria segun la posiciondef CreateFact(n,mod):    cant=n+1    factorials=[1]*cant     for x in range(1,cant):        val=factorials[x-1]*x%mod        factorials[x]=val        inv_factorial=[1]*cant    inv_factorial[n]=pow(factorials[-1], mod - 2, mod)        for x in reversed(range(0,n)):        val=inv_factorial[x+1]*(x+1)%mod        inv_factorial[x]=val            return factorials,inv_factorial     #Calcula los coeficientes de las posiciones impares que vimos que cumplen los mismo q las pares solo pueden variar el signodef CalculateNPairsCoef(n,mod):    factorial,inv_factorial=CreateFact(n,mod)    coef=[1]*n    middle=int((n+1)/2)    last=n-1    for x in range(1,middle):        o=factorial[n-1]*inv_factorial[n-1-x]%mod*inv_factorial[x]%mod        coef[x]=o        coef[last-x]=o    return coef def KarenAdTest():    #recibiendo y parseando los valores de entrada    n=int(sys.stdin.readline())    line =sys.stdin.readline().split()    i=0    while i<n:        x=int(line[i])        line[i]=x        i+=1    mod=1000000007         #Casos bases 1-5    if n==1:        val=line[0]%mod        print(val)        return     if n==2:            val=(line[0]+line[1])%mod        print(val)        return    if n==3:        val=(line[0]+2*line[1]-line[2])%mod        print(val)        return    if n==4:        val=(line[0]-line[1]+line[2]-line[3])%mod        print(val)        return    if n==5:        val=(line[0]+2*line[2]+line[4])%mod        print(val)        return        #si el numero es mayor que 5 valos a calcular sus coeficientes finales     #Como es multiplo de 2 se calcula directo los coeficientes d la primera fila    #que son los d los n valores iniciales    coefi=[]     if n%2==0:        m=int(n/2)        c=CalculateNPairsCoef(m,mod)        if n%4==0:            coefi=RestWith4(c,m,n,1)                    else:                coefi=RestWith4(c,m,n,0)    #Como no es multiplo de dos se calculan los coeficientes d la 2da fila    else:        sr=n-1        m=int(sr/2)        c=CalculateNPairsCoef(m,mod)        co=RestWith4(c,m,sr,0)         #Si deja resto 1 con n entonces las posiciones pares se anulan         # y las pares son iguales a las suma de las dos anteriores        if n%4==1:            coefi=[0]*n            coefi[0]=coefi[n-1]=1            for x in range(2,sr,2):                coefi[x]=co[x-1]+co[x]         #Si deja resto 3 con n entonces las posiciones pares son la suma de las anterior y de ella en co         # y las impares son la diferencia entre ella y su anterior        else:            coefi=[1]*n            for x in range(2,sr,2):                coefi[x]=-co[x-1]+co[x]                        for x in range(1,sr,2):                coefi[x]=co[x-1]+co[x]            coefi[sr]=-1         #Una vez calculados los coeficientes estos se multiplican por los valores de entrada    res=0    for x in range(0,n):        res+=(coefi[x]*line[x])%mod    res=int(res%mod)    print(res)     KarenAdTest()