n,m,a = map(int,input().split())ans= 0ans1 = 0if n%a == 0:    ans = n//aelse:    ans = n//a + 1if m%a == 0:    ans1= m//a else:    ans1 = m//a + 1print(ans*ans1)  
