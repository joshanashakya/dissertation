str = input()ans = {'n':0, 'i':0, 'e':0,'t':0}for i in str:    if i in ans:        ans[i]+=1ans['n'] -=1ans['n'] //=2ans['e'] //=3ans = min(ans.values())print(ans if ans>0 else 0)
