import sysimport mathfrom collections import OrderedDictdef input():    return sys.stdin.readline().strip()def iinput():   return int(input())def minput():   return map(int, input().split()) def listinput(): return list(map(int, input().split()))temp1='312831303130313130313031312831303130313130313031312831303130313130313031312831303130313130313031'temp2='312831303130313130313031312831303130313130313031312931303130313130313031312831303130313130313031312831303130313130313031'n=iinput()l=listinput()temp3=''.join(map(str,l))if temp3 in temp1 or temp3 in temp2:print('Yes')else:print('No') 
