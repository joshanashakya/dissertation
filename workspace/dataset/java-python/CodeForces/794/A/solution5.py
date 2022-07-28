s= input()p= s.split()a= int(p[0])b= int(p[1])c= int(p[2])f= input()ans=[]notes = [int(i) for i in input().split()]for i in notes:    i= int(i)    if i>b and i<c:        ans.append(i)print(len(ans))
