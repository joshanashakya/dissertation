# Taking the input from ther users = input();l=[]for i in range(int(input())):    l.append(input()) l = sorted(l)# If there is a prefect match print(s)for i in range(len(l)):    if l[i] == s:        print(s)        exit() # Check for the best match if existedfor i in range(len(l)):    if l[i][:len(s)] == s:        print(l[i])        exit() # If there is no match , print the original word print(s)  