def main():        t=int(input())    allans=[]    for _ in range(t):        x=int(input())        arr=[int(z) for z in input()]        n=len(arr)                j=1        for i in range(x):            if j==n:                break                        for yy in range(arr[i]-1):                if len(arr)>x:                    break                for zz in range(i+1,n):                    if len(arr)>x:                        break                    arr.append(arr[zz])            n+=((n-j+MOD)%MOD)*(arr[i]-1)            j+=1            n%=MOD            # print(arr[:30],n)##        allans.append(n)    multiLineArrayPrint(allans)        return    import sys# input=sys.stdin.buffer.readline #FOR READING PURE INTEGER INPUTS (space separation ok)input=lambda: sys.stdin.readline().rstrip("\r\n") #FOR READING STRING/TEXT INPUTS. def oneLineArrayPrint(arr):    print(' '.join([str(x) for x in arr]))def multiLineArrayPrint(arr):    print('\n'.join([str(x) for x in arr]))def multiLineArrayOfArraysPrint(arr):    print('\n'.join([' '.join([str(x) for x in y]) for y in arr])) def readIntArr():    return [int(x) for x in input().split()]# def readFloatArr():#     return [float(x) for x in input().split()] def makeArr(defaultVal,dimensionArr): # eg. makeArr(0,[n,m])    dv=defaultVal;da=dimensionArr    if len(da)==1:return [dv for _ in range(da[0])]    else:return [makeArr(dv,da[1:]) for _ in range(da[0])] def queryInteractive(x,y):    print('? {} {}'.format(x,y))    sys.stdout.flush()    return int(input()) def answerInteractive(ans):    print('! {}'.format(ans))    sys.stdout.flush() inf=float('inf')MOD=10**9+7  for _abc in range(1):    main()
