def answer(n, s):    f1 = s.find('1')    if f1 == -1:        return s #zeros only.    l0 = s.rfind('0')    if l0 == -1:        return s #ones only.    #s 2 units or longer at this point, with at least one 1 and one zero.    if f1 > l0 :         return s    #    ans = s[:f1] + '0' + s[l0+1:] #all zeros up to the first 1 have to stay.                   return ans def main():    t = int(input())    while t:        n = int(input())        s = input()        print(answer(n, s))        t -= 1    return    main()
