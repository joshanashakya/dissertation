from sys import stdininput=stdin.readline l=list(input())l.pop()# print(l)ans=0stack=[]for item in l:    if item=='(':        stack.append(1)    else:        if len(stack):            stack.pop()            ans+=1 print(2*ans)
