n = 2**(int(input())+1)-1;a = [0,0] + list(map(int,input().split()))r = 0while n>1:  a[n//2] += max(a[n], a[n-1])  r += abs(a[n]-a[n-1])  n -= 2print(r)    # Made By Mostafa_Khaled
