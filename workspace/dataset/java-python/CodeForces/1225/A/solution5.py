da,db = map(int,input().split())if da-db==8:    print(da,db*10)elif db-da > 1:    print(-1)elif db-da==1:    print(da,db)elif da==db:    print(da*10+1,db*10+2)else:print(-1)
