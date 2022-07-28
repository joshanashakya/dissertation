strNum=input()ones=strNum.count("1")# print(ones)strNum=strNum.replace("1","")# print(k)first2=(strNum+'2').find('2')# print(first2)strNum = strNum[:first2]+ "1"*ones +strNum[first2:]print(strNum)
