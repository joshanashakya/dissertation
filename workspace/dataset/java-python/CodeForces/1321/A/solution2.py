def main():        n=int(input())    r=readIntArr()    b=readIntArr()        rwin=0    bwin=0    for i in range(n):        if r[i]==0 and b[i]==1:            bwin+=1        elif r[i]==1 and b[i]==0:            rwin+=1        if rwin==0:        print(-1)    else:        #set bwin's ps to 1, and find min k s.t. k*rwin>bwin, or (k*rwin-1)>=bwin        # k=(bwin+rwin)//rwin        k=bwin//rwin        k+=1        print(k)    return    import sysinput=sys.stdin.buffer.readline #FOR READING PURE INTEGER INPUTS (space separation ok)# import sys# input=lambda: sys.stdin.readline().rstrip("\r\n") #FOR READING STRING/TEXT INPUTS. def oneLineArrayPrint(arr):    print(' '.join([str(x) for x in arr]))def multiLineArrayPrint(arr):    print('\n'.join([str(x) for x in arr]))def multiLineArrayOfArraysPrint(arr):    print('\n'.join([' '.join([str(x) for x in y]) for y in arr])) def readIntArr():    return [int(x) for x in input().split()]# def readFloatArr():#     return [float(x) for x in input().split()] inf=float('inf')MOD=10**9+7 main()
