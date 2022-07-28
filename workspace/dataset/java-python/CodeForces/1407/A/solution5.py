import sys 

def answer(n, a):        if


a.count(
    1) <= n // 2:  # remove all the ones. Keep all the zeros.        print(n-a.count(1)) #only zeros remain        print('0 ' * a.count(0))        return    #less than half zeros. Delete them all. Keep all of the ones if even. Delete a one if not.    if a.count(1) % 2 == 0: #even number of ones.        print(a.count(1)) #number of ones.        print('1 ' * a.count(1))        return    #odd number of ones. Delete one.    print(a.count(1) - 1)    print('1 ' * (a.count(1) - 1))    return def main():    t = int(input())    while t:        n = int(input())        a = [int(i) for i in sys.stdin.readline().split()]        answer(n, a)        t -= 1     return main()
