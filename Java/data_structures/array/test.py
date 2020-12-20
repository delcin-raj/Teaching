def moveElementToEnd(array, toMove):
    # Write your code here.
    i = 0
	#idea is that everything to the right of swapIndx is toMove
    swapIndx = len(array) - 1
    while i < swapIndx:
    	if array[i] == toMove:
            if array[swapIndx] != toMove:
                array[i],array[swapIndx] = array[swapIndx],array[i]
                i += 1; swapIndx -= 1
            else:
                swapIndx -= 1
        else:
            i += 1
			
		
