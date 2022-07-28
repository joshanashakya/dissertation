n=int(input())x=int(input())l=[0,1,2]if n%6==1:	l1=[1,0,2]elif n%6==2:	l1=[1,2,0]elif n%6==3:	l1=[2,1,0]elif n%6==4:	l1=[2,0,1]elif n%6==5:	l1=[0,2,1]else:	l1=[0,1,2]print(l[l1[x]]) 
