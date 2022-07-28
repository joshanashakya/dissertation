#%% 1301a Three stringsf = lambda: list(input())for _ in range(int(input())):    a,b,c = f(),f(),f()    print('YNEOS'[any(z!=x and z!=y for x,y,z in zip(a,b,c))==True::2])        
