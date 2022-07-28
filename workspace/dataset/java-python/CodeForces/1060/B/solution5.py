def countsum(s):    l=list(map(int,list(s)))    return sum(l)t=int(input())if (t>9):    u='9'*(len(str(t))-1)    print(countsum(u)+countsum(str(t-int(u))))elif(t<=9):    print(t)
