s = input()
ans = ' '.join(s.split())
ans = ans.replace(', ', ',')
ans = ans.replace(' ,', ',')
ans = ans.replace(',', ', ')
ans = ans.replace('... ', '...')
ans = ans.replace(' ...', '...')
ans = ans.replace('...', ' ...')
if ans[0] == ' ':    ans = ans[:0] + ans[1:]
if ans[-1] == ' ':    ans = ans[:-1]
print(ans)
