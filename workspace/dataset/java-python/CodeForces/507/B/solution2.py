import mathdef Appel(arr):    dobleR = arr[0] * 2    dx = True    dy = True    distX = (arr[3] - arr[1])**2    distY = (arr[4] - arr[2])**2    distTot = math.sqrt(distX + distY)    if(arr[3] == arr[1]):        dx = False    if(arr[4] == arr[2] ):        dy = False    if(dy == False and dx == False):        return 0    if(dy or dx):        result = distTot/dobleR    return math.ceil(result)     arr=[]arr = list(map(int, input().strip().split())) print(Appel(arr))