def binary(List, Key):
	
	bottom = 0
	top = len(List) - 1
	found = False
	
	while bottom <= top and not found:
		midpoint = (bottom + top) // 2
		
		if List[midpoint] == Key: 
			found = True
			
		else: 
			if List[midpoint] < Key:
				bottom = midpoint + 1
			else:
				top = midpoint - 1
				
				
	return found
	
list = [6,77,88,99,121,134,145]
	
print binary(list, 6)
print binary(list, 909)
			
