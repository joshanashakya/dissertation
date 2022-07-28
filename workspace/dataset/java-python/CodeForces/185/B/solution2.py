a=int(input()) b=list(map(int,input().split())) if sum(b)==0:print(' '.join([str(a/3)]*3)) else:print(' '.join(map(str,map(lambda x:a*x/sum(b),b))))     # Made By Mostafa_Khaled
