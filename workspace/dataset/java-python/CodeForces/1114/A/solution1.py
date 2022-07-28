#%% 1114a Got any grapes?  x,y,z = [*map(int,input().split())]a,b,c = [*map(int,input().split())]print('NYOE S'[all([a>=x,a+b>=(x+y),(a+b+c)>=(x+y+z)])==True::2])
