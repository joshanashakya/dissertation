def KMP_table(s):    ret = [0]     for i in range(0, len(s)):        j = i        while True:            if j == 0:                ret.append(0)                break            if s[ret[j]] == s[i]:                ret.append(ret[j] + 1)                break            j = ret[j]        return ret def strictly_increasing(L):    return all(x<y for x, y in zip(L, L[1:])) if __name__ == "__main__":    INPUT = input().rstrip()    T = KMP_table(INPUT)    longest_prefix = T[len(T) - 1]    isSamePrefix = T[longest_prefix]     for i in range(1,len(INPUT)-1):        if T[i]==longest_prefix:            isSamePrefix = longest_prefix     if(isSamePrefix == 0):        print("Just a legend")    else:        print(INPUT[0:isSamePrefix]) 	 	  	    	 	 		 	 							   	
