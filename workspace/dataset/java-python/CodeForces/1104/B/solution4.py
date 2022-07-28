s = input()st=['0']c=0for i in s:    #print(st[-1])    if i==st[-1]:        c+=1        st.pop()    else:        st.append(i)if c%2==0:    print('No')else:    print('Yes')
