n=int(input()) def bruteforce(number):    res=0    liste=[]    while number>0:        integer=number%10        if integer not in liste:            liste.append(integer)                number=number//10    return len(liste)<=2 answer=[0] def dfs(num):    if (num>0 and num<=n):        answer[0]+=1        for a in range(10):            if bruteforce(num*10+a):                dfs(num*10+a) for chiffre in range(1,10):    dfs(chiffre) print(answer[0])
