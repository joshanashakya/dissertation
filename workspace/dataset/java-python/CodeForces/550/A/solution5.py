s=input()if (s.find("AB")!=-1 and s.find("BA")!=-1 and (s.find("AB")+1<s.rfind("BA") or s.find("BA")+1<s.rfind("AB"))):	print("YES")else:	print("NO")
