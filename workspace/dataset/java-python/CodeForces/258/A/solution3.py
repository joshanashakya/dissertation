def answer(a):    al = list(a) #list of strings '0' and '1'    if al.count('0') == 0: #no zeros. Pop off the last 1.        al.pop()        return ''.join(al)    #At least 1 zero.    indx = al.index('0')    al.pop(indx)        return ''.join(al) def main():    a = input()    print(answer(a))      returnmain()