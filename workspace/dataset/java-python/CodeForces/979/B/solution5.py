n= int(input()) kuroo=input()shiro=input()katie=input() kuroo_dict={}shiro_dict={}katie_dict={} def cal(d,str,n):     for i in range(len(str)):        if str[i] in d:            d[str[i]]+=1        else:            d[str[i]]=1     m=0    for key in d:        m=max(m,d[key])     if(n==1 and m==len(str)):        m=len(str)-1    else:        m=min(m+n,len(str))      return m    ans_kuroo=cal(kuroo_dict,kuroo,n)ans_shiro=cal(shiro_dict,shiro,n)ans_katie=cal(katie_dict,katie,n)ans=max(ans_kuroo,ans_shiro,ans_katie) if (ans_kuroo == ans_katie and ans_kuroo == ans) or (ans_katie == ans_shiro and ans_shiro == ans) or (ans_shiro == ans_kuroo and ans_kuroo == ans) :    print("Draw")else:    if ans == ans_kuroo :        print("Kuro")    elif ans == ans_shiro :        print("Shiro")    else :        print("Katie")     
