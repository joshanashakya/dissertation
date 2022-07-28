#%% 1257a Two rivalstudents for _ in range(int(input())):    n,x,a,b = [int(x) for x in input().split()]    dist = abs(b-a)    print(min(abs(b-a)+x,n-1))        
