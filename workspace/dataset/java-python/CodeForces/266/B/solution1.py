def ret(inp):       lst=inp.copy()    for i in range(len(inp)):        if inp[i]=='G':            j=i-1            k=t            if j>=0 and inp[j]=='B':                lst[j+1]='B'                lst[j]='G'    return lstn, t= [int(x) for x in input().split()]inp = input()inp_lst = []for c in inp:    inp_lst.append(c)for c in range(t):    inp_lst = ret(inp_lst) lst_str = "".join(inp_lst)print(lst_str)
