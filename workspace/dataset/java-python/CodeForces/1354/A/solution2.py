pp=printli=listtp=tuplebg=1e9sg=-1e9rd=roundss=sortedsj="".joinnl="\n"  def solve():    a,b,c,d=map(int,input().split())    if b>=a:        print(b)    elif d>=c:        print(-1)    else:        print(b+(0--(a-b)//(c-d))*c)         def main():    for i in range(int(input())):        solve() main()                  
