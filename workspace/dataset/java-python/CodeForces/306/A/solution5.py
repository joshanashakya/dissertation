n, m = map(int, input().split()) if n>=m:	m_list = [0]*m		adding = n//m	sub_adding = n%m		for i in range(adding):		for j in range(len(m_list)):			m_list[j]+=1	for k in range(sub_adding):		m_list[k]+=1		for l in m_list:		print(l, sep=" ",end=" ")