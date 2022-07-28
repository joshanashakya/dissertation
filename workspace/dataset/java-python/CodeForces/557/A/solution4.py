n=int(input())a1,b1=map(int,input().split())a2,b2=map(int,input().split())a3,b3=map(int,input().split())ans1=min(n-(a2+a3),b1)ans2=min(n-(ans1+a3),b2)ans3=n-(ans1+ans2)print(ans1,ans2,ans3)
