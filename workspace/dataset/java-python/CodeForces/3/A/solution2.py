start = input()end = input() alist = ('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h') startx = alist.index(start[0]) + 1endx = alist.index(end[0]) + 1starty = int(start[1])endy = int(end[1]) xdirection = 0ydirection = 0 xtimes = 0ytimes = 0 outputlist = [] if startx > endx:    xdirection = 'L'    xtimes = startx - endxelif startx < endx:    xdirection = 'R'    xtimes = endx - startxif starty > endy:    ydirection = 'D'    ytimes = starty - endyelif starty < endy:    ytimes = endy - starty    ydirection = 'U'  if xtimes == ytimes:    for x in range(xtimes):        outputlist.append(xdirection + ydirection)elif xtimes < ytimes:    for x in range(xtimes):        outputlist.append(xdirection + ydirection)    for x in range(ytimes - xtimes):        outputlist.append(ydirection)elif xtimes > ytimes:    for x in range(ytimes):        outputlist.append(xdirection + ydirection)    for x in range(xtimes - ytimes):        outputlist.append(xdirection)outputlist.insert(0, len(outputlist))for y in outputlist:    print(y)    
